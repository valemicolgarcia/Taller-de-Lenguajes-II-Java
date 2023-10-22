package orquesta2;

public class Cuerdas extends InstrumentoMusical {
	
	
	//CONSTRUCTOR NULO
	public Cuerdas(){
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Cuerdas(String nombre) {
		super(nombre,TipoInstrumento.CUERDAS);
	}
	
	//COMPORTAMIENTO
	public void afinar(TipoAfinacion nota) {
		super.setAfinacion(nota);
		System.out.println("Se afino el instrumento de cuerdas con la notas: " + nota);
	}
	
	
	
}
