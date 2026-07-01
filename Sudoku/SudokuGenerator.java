import java.util.Random;
import java.util.Scanner;

public class SudokuGenerator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the Sudoku (e.g., 4 for 4x4, 9 for 9x9): ");
        int size = scanner.nextInt();
        
        // Validate that size is a perfect square
        int subgridSize = (int) Math.sqrt(size);
        if (subgridSize * subgridSize != size) {
            System.out.println("Error: Size must be a perfect square (4, 9, 16, 25, etc.)");
            scanner.close();
            return;
        }
        
        int[][] sudoku = generateSudoku(size);
        printSudoku(sudoku, subgridSize);
        
        scanner.close();
    }
    
    public static int[][] generateSudoku(int size) {
        int[][] grid = new int[size][size];
        Random rand = new Random();
        
        fillGrid(grid, 0, 0, size, rand);
        
        return grid;
    }
    
    private static boolean fillGrid(int[][] grid, int row, int col, int size, Random rand) {
        // Move to next row if we've filled current row
        if (col == size) {
            row++;
            col = 0;
        }
        
        // Base case: grid is completely filled
        if (row == size) {
            return true;
        }
        
        // Create array of numbers 1 to size and shuffle them randomly
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }
        shuffleArray(numbers, rand);
        
        // Try each number in random order
        for (int num : numbers) {
            if (isValid(grid, row, col, num, size)) {
                grid[row][col] = num;
                
                if (fillGrid(grid, row, col + 1, size, rand)) {
                    return true;
                }
                
                grid[row][col] = 0;
            }
        }
        
        return false;
    }
    
    private static boolean isValid(int[][] grid, int row, int col, int num, int size) {
        // Check row
        for (int c = 0; c < size; c++) {
            if (grid[row][c] == num) return false;
        }
        
        // Check column
        for (int r = 0; r < size; r++) {
            if (grid[r][col] == num) return false;
        }
        
        // Check subgrid
        int subgridSize = (int) Math.sqrt(size);
        int startRow = (row / subgridSize) * subgridSize;
        int startCol = (col / subgridSize) * subgridSize;
        for (int r = startRow; r < startRow + subgridSize; r++) {
            for (int c = startCol; c < startCol + subgridSize; c++) {
                if (grid[r][c] == num) return false;
            }
        }
        
        return true;
    }
    
    private static void shuffleArray(int[] array, Random rand) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
    public static void printSudoku(int[][] grid, int subgridSize) {
        int size = grid.length;
        System.out.println("\nGenerated " + size + "x" + size + " Sudoku:");
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Format numbers to align properly
                System.out.printf("%2d ", grid[i][j]);
                
                // Add vertical separator for subgrids
                if ((j + 1) % subgridSize == 0 && j < size - 1) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            
            // Add horizontal separator for subgrids
            if ((i + 1) % subgridSize == 0 && i < size - 1) {
                for (int k = 0; k < size * 3 + subgridSize - 1; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}