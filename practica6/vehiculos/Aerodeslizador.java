package vehiculos;

public class Aerodeslizador implements VehiculoDeTierra,VehiculoDeMar{
	
	public void conducir() {
		System.out.println("esta andando el deslizadooooorrrr");
	}
	
	public void emprenderMarcha() {
		System.out.println("run run emprendiendo marcha");
	}
	
	public void entrarATierra() {
		System.out.println("entrando a tierra....");
	}
	
	public void entrarAMar() {
		System.out.println("entrando a mar....");
	}
}

