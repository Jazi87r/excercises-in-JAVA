package bean;

public class Chasis {
	// A tributos
	private String id;
	private int largoPlaca;
	private int anchoPlaca;
	private int ranuras;
	private String adminCables;
	private int ancho;
	private int alto;
	private int profundidad;

	public Chasis() {
		
		id = "0";
		largoPlaca = 30;
		anchoPlaca = 24;
		ranuras = 8;
		adminCables = "si";
		ancho = 60;
		alto = 45;
		profundidad = 83;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLargoPlaca() {
		return largoPlaca;
	}

	public void setLargoPlaca(int largoPlaca) {
		this.largoPlaca = largoPlaca;
	}

	public int getAnchoPlaca() {
		return anchoPlaca;
	}

	public void setAnchoPlaca(int anchoPlaca) {
		this.anchoPlaca = anchoPlaca;
	}

	public int getRanuras() {
		return ranuras;
	}

	public void setRanuras(int ranuras) {
		this.ranuras = ranuras;
	}

	public String getAdminCables() {
		return adminCables;
	}

	public void setAdminCables(String adminCables) {
		this.adminCables = adminCables;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}
}