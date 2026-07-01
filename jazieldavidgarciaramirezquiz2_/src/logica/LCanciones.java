package logica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import bean.BCancion;

public class LCanciones {
	private ArrayList<BCancion> canciones = new ArrayList<BCancion>();

	public ArrayList<BCancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<BCancion> canciones) {
		this.canciones = canciones;
	}
	public void desserializar() {
		
	}
	public void serializar() {
		
	}
	public void ingresar_canciones(BCancion cancion) {
		File file = new File("quiz2tlp1.txt");

		try {

			// Create the file if it doesn't exist
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File created: " + "quiz2tlp1.txt");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<BCancion> canciones_;
		// verifico si el archivo serializado estaá vacio
		if (file.length() == 0) {
			System.out.println("The file is empty.");
			// como está vacio, creo mi propio array
			canciones_ = new ArrayList<BCancion>();
			canciones_.add(cancion);
		} else {
			canciones_ = leer();
			canciones_.add(cancion);
		}	
		//vacio el archivo txt
				try {
		            FileWriter fileWriter = new FileWriter("quiz2tlp1.txt", false);
		            fileWriter.close();
		            System.out.println("File quiz2tlp1.txt has been cleared.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
				//escribo el arraylist en el archivo txt serializado
				try {
					FileOutputStream ruta_salida = new FileOutputStream("quiz2tlp1.txt");
					ObjectOutputStream archivo_salida = new ObjectOutputStream(ruta_salida);
					archivo_salida.writeObject(canciones_);
					archivo_salida.close();
				} catch (Exception e) {
					System.out.println("este");
					System.out.println("Problemas con el acceso al archivo de datos - " + e);

				}
	}
	public ArrayList<BCancion> leer(){
		//en la siguiente linea de codigo seria redundante declarar un new array porque igualmente mas abajo lo creo nuevamente
		ArrayList<BCancion> canciones = new ArrayList<BCancion>();
		try {
			FileInputStream ruta_entrada = new FileInputStream("quiz2tlp1.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			canciones = (ArrayList<BCancion>) leer_datos.readObject();
			leer_datos.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Problemas con el acceso al archivo de datos.");
		}


		return canciones;
		
	}
	public void listar() {
		ArrayList<BCancion> para_leer= leer();
		System.out.println("ESTO ES LO QUE HAY EN EL ARRAYLIST DE CANCIONES");
		for (int i = 0; i < para_leer.size(); i++) {
			System.out.println("cancion numero"+(i+1));
			System.out.println("el tono de la cancion es: "+para_leer.get(i).getComposicion().getTonocancion());
			System.out.println("los acordes de la cancion son: "+para_leer.get(i).getComposicion().getAcordes());
			System.out.println("el solo de la cancion es: "+para_leer.get(i).getComposicion().getSolo());

            
        }
	}
}
