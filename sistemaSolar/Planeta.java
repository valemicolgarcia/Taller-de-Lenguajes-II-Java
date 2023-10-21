package sistemaSolar;


public abstract class Planeta {
	
	private String nombre; //nombre del planeta
	private int cantLunas; //cantidad de lunas del planeta
	private int diametro; // kilometros de diametro del planeta
	private Telescopio t = new Telescopio();
	private int distanciaAlSol = t.distanciaAlSol(); //no se si estara bien
	
	//CONSTRUCTOR VACIO
	public Planeta () {
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Planeta(String nombre, int cantLunas, int diametro) { //no puse el telescopio ni el diametro
		super();
		this.nombre = nombre;
		this.cantLunas = cantLunas;
		this.diametro = diametro;
	}
	
	//----------------------GETTERS AND SETTERS-----------------------------------------------------
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantLunas() {
		return cantLunas;
	}
	public void setCantLunas(int cantLunas) {
		this.cantLunas = cantLunas;
	}
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	public Telescopio getT() {
		return t;
	}
	public void setT(Telescopio t) {
		this.t = t;
	}
	
	public int getDistanciaAlSol() {
		return distanciaAlSol;
	}
	public void setDistanciaAlSol(int distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	
	//--------------------------------------METODOS----------------------------------------------
	//sobreescritura del metodo 
	@Override
	public String toString() {
		return "Nombre= " + nombre + ", cantLunas=" + cantLunas + ", diametro=" + diametro + ", distanciaAlSol=" + distanciaAlSol;
	}
	
	//sobreescritura del metodo equals
	public boolean equals(Planeta o) { // puse el parametro como Complex no como object
		return ((o.nombre == this.nombre) && (this.cantLunas == o.cantLunas) && (o.diametro == this.diametro) && (o.distanciaAlSol == this.distanciaAlSol));

	}
}
