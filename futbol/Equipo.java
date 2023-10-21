package futbol;

import java.util.ArrayList;

public class Equipo {
	
	private ArrayList <Jugador> jugadores = new ArrayList<>();
	
	
	//CONSTRUCTOR VACIO
	public Equipo() {
	}
	
	//GETTERS AND SETTERS
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	//AGREGAR JUGADOR
	public void agregarJugador(Jugador j) {
		jugadores.add(j);
		System.out.println("El jugador se agrego correctamente al equipo");
	}
	
	
}
