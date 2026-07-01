package vista;

import logica.LChasis;
import bean.Chasis;
import java.util.Scanner;

public class VChasis {
	public static void chasis() {

		Scanner leer = new Scanner(System.in);
		int op;
		LChasis lcha = new LChasis();

		String menu = "menu chasis\n\n " + "1-Ingresar \n" + " 2-Modificar\n" + " 3-Buscar\n " + " 4-Listar\n"
				+ " 5-Eliminar\n" + " 6-Volver\n" + " 7-Salir\n" + "Ingrese una opcion:";
		System.out.print(menu);
		op = leer.nextInt();
		do {
			switch (op) {
			case 1:
				Chasis chasis = new Chasis();
				System.out.print("Ingrese el serial del chasis: ");
				chasis.setId(leer.next());
				System.out.print("Ingrese el alto del chasis: ");
				chasis.setAlto(leer.nextInt());
				System.out.print("\nIngrese el ancho del chasis: ");
				chasis.setAnchoPlaca(leer.nextInt());
				System.out.print("\nIngrese la profundidad del chasis: ");
				chasis.setProfundidad(leer.nextInt());
				System.out.print("\nIngrese el numero de ranuras que tiene el chasis: ");
				chasis.setProfundidad(leer.nextInt());
				System.out.print("\nIngrese el largo de la MB: ");
				chasis.setLargoPlaca(leer.nextInt());
				System.out.print("\nIngrese el ancho de la MB: ");
				chasis.setAnchoPlaca(leer.nextInt());
				System.out.print("\nDiga si el chasis tiene administracion de cables(si/no): ");
				chasis.setAdminCables(leer.next());
				lcha.Insertar(chasis);
				System.out.print(menu);
				op = leer.nextInt();
				break;
			case 2:
				System.out.print("No disponible");
				System.out.print(menu);
				op = leer.nextInt();
				break;
			case 3:
				String idb;
				Scanner tb = new Scanner(System.in);
				System.out.print("Ingrese el serial del chasis a buscar: ");
				idb = tb.next();
				lcha.Buscar(idb);
				System.out.print(menu);
				op = leer.nextInt();
				break;
			case 4:
				System.out.print(lcha.Listar());
				System.out.print(menu);
				op = leer.nextInt();
				break;
			case 5:
				System.out.print("No disponible");
				System.out.print(menu);
				op = leer.nextInt();
				break;
			case 6:
				Accion.maestras();
				break;
			case 7:
				System.exit(0);
				break;
			}
		} while (op != 0);
	}

}
