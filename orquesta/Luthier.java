package orquesta;

public class Luthier {
	
	
	//METODO DE CLASE AFINAR
	public static void afinar(Categoria cat) {
		switch (cat) {
			case CUERDAS:{
				System.out.println("Se afino instrumento de cuerdas");
			}
			case VIENTO:{
				System.out.println("Se afino instrumento de viento");
			}
			case PERCUSION:{
				System.out.println("Se afino instrumento de percusion");
			}
		}
	}
		
	
}
