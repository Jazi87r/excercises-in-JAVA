package bean;

import java.io.Serializable;

public class BCancion implements Serializable {
	private BComposicionMusical composicion;

	public BComposicionMusical getComposicion() {
		return composicion;
	}

	public void setComposicion(BComposicionMusical composicion) {
		this.composicion = composicion;
	}
	

}
