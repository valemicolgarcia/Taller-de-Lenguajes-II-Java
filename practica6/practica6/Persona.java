package practica6;

public class Persona implements Comparable <Persona>{
	
	private String nombre;
	private String apellido;
	private int edad;
	
	//CONSTRUCTOR VACIO
	public Persona (String n, String a, int e) {
		nombre = n;
		apellido = a;
		edad = e;
	}
	
	public Persona () {
		
	}
	
	// TO STRING
	public String toString() {
		return apellido + " , " + nombre;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//COMPARE TO
	/*Como la clase implementa comparable, hace a sus instancias comparables. Esta interface tiene solo un metodo, compareTo
	 el cual determina COMO comparar dos instancias de la misma clase
	 */
	public int compareTo (Persona o) {
		String persona = this.nombre.concat(this.apellido);
		String persona2 = o.nombre.concat(o.apellido);
		return (persona.compareTo(persona2));
	}

	

	
	
	
}
