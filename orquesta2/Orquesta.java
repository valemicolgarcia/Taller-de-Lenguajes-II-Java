package orquesta2;

import java.util.ArrayList;

public class Orquesta {
	
	//ESTADO
	private ArrayList <InstrumentoMusical> orquesta = new ArrayList<>();
	
	
	//COMPORTAMIENTO
	public void agregarInstrumento(InstrumentoMusical ins) {
		this.orquesta.add(ins);
	}
	public void eliminarInstrumento(InstrumentoMusical ins) {
		this.orquesta.remove(ins);
	}
	
	//GETTERS AND SETTERS
	public ArrayList<InstrumentoMusical> getOrquesta() {
		return orquesta;
	}
	public void setOrquesta(ArrayList<InstrumentoMusical> orquesta) {
		this.orquesta = orquesta;
	}
	
	@Override
	public String toString() {
		return "Orquesta [orquesta=" + orquesta + "]";
	}
	
	
	
	
	
}
