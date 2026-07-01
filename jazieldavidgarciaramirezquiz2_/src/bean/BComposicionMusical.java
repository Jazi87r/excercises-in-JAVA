package bean;

import java.io.Serializable;

public class BComposicionMusical implements Serializable{
	private String tonocancion,solo,acordes;

	public String getTonocancion() {
		return tonocancion;
	}

	public void setTonocancion(String tonocancion) {
		this.tonocancion = tonocancion;
	}

	public String getSolo() {
		return solo;
	}

	public void setSolo(String solo) {
		this.solo = solo;
	}

	public String getAcordes() {
		return acordes;
	}

	public void setAcordes(String acordes) {
		this.acordes = acordes;
	}
}
	


