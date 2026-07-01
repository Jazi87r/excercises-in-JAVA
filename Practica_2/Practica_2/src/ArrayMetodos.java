/*
 * en esta clase se encuentra la declaracion del arraylist de usuarios junto con los metodós y operaciones
 * que el profesor pidió imprimir al final*/
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
public class ArrayMetodos {
	private ArrayList<Usuario> myList = new ArrayList<>();
	private int cont;

	public ArrayList<Usuario> getMyList() {
		return myList;
	}

	public void setMyList(ArrayList<Usuario> myList) {
		this.myList = myList;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	public void metodos() {
		float size=myList.size();
float cont3=0;
		int cont1=0, cont2=0;
		String datos;
		
		String regex="\\bCédula de extranjería\\b";
		String regex2="\\bPasaporte\\b";
		String regex3="\\bOtro\\b";

		for (int i = 0; i < myList.size(); i++) {
			if(Pattern.compile(regex).matcher(myList.get(i).getTipoID()).matches()) {
				cont1++;
				
			}
			if(Pattern.compile(regex2).matcher(myList.get(i).getTipoID()).matches()) {
				cont2++;
				
			}
			if(Pattern.compile(regex3).matcher(myList.get(i).getNacionalidad()).matches()) {
				cont3++;
			}
			
		}

		int des=0;
		do {
			String input = JOptionPane.showInputDialog("que desea ver?\n1. Porcentaje de personas que al momento de confirmar el correo electrónico no escribieron lo mismo.\n2. Cantidad de personas que tienen como tipo de documento “cédula de extranjería” y aparte las que tienen 'pasaporte'\n3. Promedio de personas que tienen como nacionalidad “otro”.\n0. Volver	");			
			des=Integer.parseInt(input);
			switch (des) {
			case 1:
				float n=cont;
				float r;
				r=(n*100)/size;

				JOptionPane.showMessageDialog(null,"El porcentaje de personas que al momento de confirmar el correo electronico no escribieron lo mismo fue "+r+"%");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"la cantidad de personas que tienen como tipo de documento cdedula de extranjeria es: "+cont1+" y la cantidad de pasaporte es: "+cont2);

				break;
			case 3:
				float r2;
				r2=(cont3*100)/size;

				JOptionPane.showMessageDialog(null,"el porcentaje de personas que tienen como nacionalidad 'otro' es: "+r2+"%");

				break;
				

			}

		} while (des != 0);
	}
}
