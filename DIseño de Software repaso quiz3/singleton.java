public class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private so no one can instantiate the class directly
    private Singleton() {}

    // Step 3: Provide a public method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton singleton = Singleton.getInstance();

        // Call a method
        singleton.showMessage();
    }
}
