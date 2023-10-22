package sistemaSolar2;

import java.util.ArrayList;

public class SistemaSolar {
	
	//PATRON SINGLETON
	
	//variable privada del tipo de la clase para referenciar a la ultima instancia
	private static SistemaSolar INSTANCE = new SistemaSolar();
	
	//constructor privado para evitar la creacion de objetos desde otras clases
	private SistemaSolar() {
		
	}
	
	//metodo publico de clase que retorne dicha instancia
	public static SistemaSolar getInstance() {
		return INSTANCE;
	}
	
	//ESTADO
	
	private ArrayList <Planeta> planetas = new ArrayList<>();

	//GETTERS AND SETTERS

	public ArrayList<Planeta> getPlanetas() {
		return planetas;
	}
	
	public void setPlanetas(ArrayList<Planeta> planetas) {
		this.planetas = planetas;
	}
	
	//COMPORTAMIENTO 
	
	public void agregarPlaneta(Planeta p) {
		this.planetas.add(p);
	}
	
	public void eliminarPlaneta(Planeta p) {
		this.planetas.remove(p);
	}

	@Override
	public String toString() {
		return "SistemaSolar [planetas=" + planetas + "]";
	}

	
	
	
	
}
