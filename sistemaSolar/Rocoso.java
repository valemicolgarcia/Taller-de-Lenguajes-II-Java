package sistemaSolar;



public class Rocoso extends Planeta {
	
	private int rocas; //cantidad de rocas
	

	//CONSTRUCTOR VACIO
	public Rocoso() {
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Rocoso(String nombre, int cantLunas, int diametro) {
		super(nombre, cantLunas, diametro);
		
	}
	
	//GETTERS AND SETTERS
	public int getRocas() {
		return rocas;
	}
	
	public void setRocas(int rocas) {
		this.rocas = rocas;
	}
	
	//METODOS
	
	//sobreescritura del metodo ToString
	@Override
	public String toString() {
		return "El planeta es de tipo rocoso. Sus caracteristicas son: " + super.toString();
	}
	
	//sobreescritura del metodo equals
	public boolean equals(Rocoso o) { 
		return ( (o.rocas == this.rocas) && (super.equals(o)));

	}
	
	
}
