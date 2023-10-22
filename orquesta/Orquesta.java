package orquesta;

import java.util.ArrayList;


public class Orquesta {
	
	private ArrayList <InstrumentoMusical> instrumentos = new ArrayList<>();
	

	//CONSTRUCTOR NULO
	public Orquesta() {
	}
	
	//GETTERS AND SETTERS
	public ArrayList<InstrumentoMusical> getInstrumentos() {
		return instrumentos;
	}
	
	public void setInstrumentos(ArrayList<InstrumentoMusical> instrumentos) {
		this.instrumentos = instrumentos;
	}
	
	//COMPORTAMIENTO
	public void agregarInstrumento(InstrumentoMusical i) {
		this.instrumentos.add(i);
	}
	
	public void eliminarInstrumento (InstrumentoMusical i ) {
		instrumentos.remove(i);
	}
	
	//sobreescritura del metodo toString
	@Override
	public String toString() {
		String nombres = "Instrumentos: ";
		for (InstrumentoMusical i : instrumentos) {
			nombres = nombres + i.getNombre()+ " , " ;
		}
		
		
		return nombres;
	}
	
	
	
	
	
}
