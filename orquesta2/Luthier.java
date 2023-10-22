package orquesta2;


public class Luthier {
		
	//METODO DE CLASE AFINAR
		public static void afinar(InstrumentoMusical ins) {
			TipoInstrumento tipo = ins.getTipo();
			
			switch (tipo) {
				case CUERDAS:{
					ins.afinar(TipoAfinacion.DO);
					System.out.println("Se afino instrumento de cuerdas");
					break;
				}
				case VIENTO:{
					ins.afinar(TipoAfinacion.SI);
					System.out.println("Se afino instrumento de viento");
					break;
				}
				case PERCUSION:{
					ins.afinar(TipoAfinacion.RE);
					System.out.println("Se afino instrumento de percusion");
					break;
				}
			}
		}
	
	
}
