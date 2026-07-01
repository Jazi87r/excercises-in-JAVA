package vista;

import java.util.Scanner;
import bean.BComposicionMusical;
import bean.BCancion;
import logica.LCanciones;
public class Menus {
	public static void main_menu() {
		Scanner entrada = new Scanner(System.in);

		int des;
		do {
			System.out.println("1.ingresar\n2.Listar");
			des = entrada.nextInt();
			switch (des) {
			case 1:
				System.out.println("ingrese en que tono está la cancion");
				String tono=entrada.next();
				System.out.println("ingrese el solo de la cancion");
				String solo=entrada.next();
				System.out.println("ingrese los acordes de la cancion");
				String acordes= entrada.next();
				BComposicionMusical composicion= new BComposicionMusical();
				composicion.setAcordes(acordes);
				composicion.setSolo(solo);
				composicion.setTonocancion(tono);
				BCancion armarcancion= new BCancion();
				armarcancion.setComposicion(composicion);
				LCanciones canciones= new LCanciones();
				canciones.ingresar_canciones(armarcancion);

				break;
			case 2:
				LCanciones canciones_= new LCanciones();
				canciones_.listar();
			}

		} while (des != 0);

	}

}
