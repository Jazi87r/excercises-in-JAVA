package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import bean.Chasis;
import bean.DiscoDuro;

public class LChasis {

	public void Insertar(Chasis chasis) {
		try {
			FileWriter archivo = new FileWriter(".\\src\\file\\chasis.txt", true);
			BufferedWriter escribir = new BufferedWriter(archivo);
			PrintWriter linea = new PrintWriter(escribir);
			linea.append("Id: " + chasis.getId() + ",Alto: " + chasis.getAlto() + ",Ancho: " + chasis.getAncho()
					+ ",Profundidad: " + chasis.getProfundidad() + ",AnchoPlaca: " + chasis.getAnchoPlaca()
					+ ",LargoPlaca: " + chasis.getLargoPlaca() + ",NumeroRanuras: " + chasis.getRanuras()
					+ ",AdmiCables: " + chasis.getAdminCables() + "\n");
			linea.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String Consultar(String idb) {
		ArrayList<String> Ar = new ArrayList<String>();
		char sw = 'f';
		try {
			FileReader archivo = new FileReader(".\\src\\file\\chasis.txt");
			BufferedReader escribir = new BufferedReader(archivo);
			String I = "";

			while (I != null) {
				I = escribir.readLine();
				if (I != null) {
					Ar.add(I);
				}
			}
			Iterator<String> It = Ar.iterator();
			while (It.hasNext() && sw == 'f') {
				I = It.next();

				int D = I.indexOf("Id: ") + 4, H = I.indexOf(",");
				String serial = I.substring(D, H);

				if (idb.equals(serial)) {
					System.out.println("El chasis a buscar es: " + I);
					sw = 'v';
					return serial;
				}
				System.out.println(serial + "-" + idb);
			}
			if (sw == 'f') {
				System.out.println("El chasis con serial: " + idb + " no se ha encontrado \n");
			}
			archivo.close();

		} catch (Exception e) {

		}
		return null;

	}

	public String Buscar(String idb) {

		ArrayList<String> Ar = new ArrayList<String>();
		char sw = 'f';
		try {
			FileReader archivo = new FileReader(".\\src\\file\\chasis.txt");
			BufferedReader escribir = new BufferedReader(archivo);
			String I = "";

			while (I != null) {
				I = escribir.readLine();
				if (I != null) {
					Ar.add(I);
				}
			}
			Iterator<String> It = Ar.iterator();
			while (It.hasNext() && sw == 'f') {
				I = It.next();

				int D = I.indexOf("Id: ") + 4, H = I.indexOf(",");
				String serial = I.substring(D, H);

				if (idb.equals(serial)) {
					System.out.println("El chasis a buscar es: " + I);
					sw = 'v';
					return I;
				}
				System.out.println(serial + "-" + idb);
			}
			if (sw == 'f') {
				System.out.println("El chasis con serial: " + idb + " no se ha encontrado \n");
			}
			archivo.close();

		} catch (Exception e) {

		}
		return null;

	}

	public String Listar() {

		try (BufferedReader bf = new BufferedReader(new FileReader(".\\src\\file\\chasis.txt"))) {
			String linea, lectura = "";
			while ((linea = bf.readLine()) != null) {
				lectura = lectura + linea + "\n";
			}
			return lectura;
		} catch (IOException e) {
			System.out.println(e);
		}
		return null;

	}

	public void Eliminar() {

	}

}
