package orquesta2;

import java.util.Arrays;

public class Orquestavector {
	
	//ESTADO
	private InstrumentoMusical[] orq = new InstrumentoMusical[7];

	public Orquestavector() {
		super();
		//2 instrumentos de cuerdas
		orq[0] = new Cuerdas("guitarra");
		orq[1] = new Cuerdas("bajo");
		//3 instrumentos de viento
		orq[2] = new Viento("trompeta");
		orq[3] = new Viento("tromba");
		orq[4] = new Viento("trombon");
		//2 instrumentos de percusion
		orq[5] = new Percusion("bombo");
		orq[6]= new Percusion("platillo");
	}
	
	//SOBREESCRITURA DEL METODO TO STRING
	@Override
	public String toString() {
		return "Orquestavector [orq=" + Arrays.toString(orq) + "]";
	}
	
	//GETTERS AND SETTERS
	public InstrumentoMusical[] getOrq() {
		return orq;
	}
	
	public void setOrq(InstrumentoMusical[] orq) {
		this.orq = orq;
	}
	
	
	
}
