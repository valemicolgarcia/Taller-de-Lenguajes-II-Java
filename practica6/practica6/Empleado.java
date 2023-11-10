package practica6;

public class Empleado extends Persona  {
	
	private int legajo;
	private double sueldo;
	
	
	public Empleado(String n, String a, int e,int legajo, double sueldo) {
		super(n,a,e);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	// TO STRING
	@Override
	public String toString() {
		return super.toString()+ "Empleado [legajo=" + legajo + ", sueldo=" + sueldo + "]";
	}
	
	//COMPARE TO
	//sobreescribo el compare to de la clase persona para que compare con este criterio
	public int compareTo (Empleado o) {

		int nro = super.compareTo(o);
		System.out.println("Compara nombre y apellido y da:" + nro);
		
		if (nro==0) {
			System.out.println("hola");
			return (Double.compare(sueldo, o.sueldo));
		}
		else {
			return nro;
		}
	}
	
	
}
