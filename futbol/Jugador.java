package futbol;

public class Jugador {
	
	private String nombre;
	private Posicion pos1;
	private Posicion pos2;
	
	//CONSTRUCTOR NULO
	public Jugador(){
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Jugador(String nombre, Posicion pos1, Posicion pos2) {
		super();
		this.nombre = nombre;
		this.pos1 = pos1;
		this.pos2 = pos2;
	}
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Posicion getPos1() {
		return pos1;
	}
	public void setPos1(Posicion pos1) {
		this.pos1 = pos1;
	}
	public Posicion getPos2() {
		return pos2;
	}
	public void setPos2(Posicion pos2) {
		this.pos2 = pos2;
	}
	
	
	
}
