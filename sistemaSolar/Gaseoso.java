package sistemaSolar;

public class Gaseoso extends Planeta{
	
	private int gases; //cantidad de rocas
	


	//CONSTRUCTOR VACIO
	public Gaseoso() {
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Gaseoso(String nombre, int cantLunas, int diametro) {
		super(nombre, cantLunas, diametro);
		
	}
	
	//GETTERS AND SETTERS
	public int getGases() {
		return gases;
	}
	
	public void setGases(int gases) {
		this.gases = gases;
	}
	
	//METODOS
	//sobreescritura del metodo toString
	@Override
	public String toString() {
		return "El planeta es de tipo gasesoso. Sus caracteristicas son: " + super.toString();
	}
	
	//sobreescritura del metodo equals
		public boolean equals(Gaseoso o) { 
			return ( (o.gases == this.gases) && (super.equals(o)));

		}
	
	
}
