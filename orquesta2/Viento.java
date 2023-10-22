package orquesta2;

public class Viento extends InstrumentoMusical {
	
	
	//CONSTRUCTOR NULO
	public Viento(){
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public Viento(String nombre) {
		super(nombre,TipoInstrumento.VIENTO);
	}
	
	//COMPORTAMIENTO
	public void afinar(TipoAfinacion nota) {
		super.setAfinacion(nota);
		System.out.println("Se afino el instrumento de cuerdas con la notas: " + nota);
	}
	
	
}
