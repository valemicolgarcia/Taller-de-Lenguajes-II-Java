package sistemaSolar;

import java.util.ArrayList;

public class SistemaSolar {
	
	//PATRON SINGLETON
	
	//variable privada del tipo de la clase para referenciar a la ultima instancia
	private static SistemaSolar INSTANCE = new SistemaSolar();
	
	//constructor privado
	private SistemaSolar() {
	}
	
	//metodo publico de clase que retorna la instancia
	public static SistemaSolar getInstance(){
		return INSTANCE;
	}
	
	//lista de planetas UPCASTING
	private ArrayList <Planeta> planetas = new ArrayList<>();
	

	public void agregarPlaneta(Planeta p) {
		planetas.add(p);
		System.out.println("El planeta se agrego correctamente");
	}
	
	@Override
	public String toString() {
		return "SistemaSolar [planetas=" + planetas + "]";
	}
	
	
	
}
