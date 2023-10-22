package orquesta2;

public class Percusion extends InstrumentoMusical {
		

	//CONSTRUCTOR NULO
	public Percusion(){
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Percusion(String nombre) {
		super(nombre,TipoInstrumento.PERCUSION);
	}
	
	//COMPORTAMIENTO
	public void afinar(TipoAfinacion nota) {
		super.setAfinacion(nota);
		System.out.println("Se afino el instrumento de cuerdas con la notas: " + nota);
	}
	
	
}
