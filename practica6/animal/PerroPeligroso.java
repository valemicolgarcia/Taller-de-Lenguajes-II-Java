package animal;

import animalespeligrosos.AnimalPeligroso;
import domestico.PerroDomestico;

public class PerroPeligroso implements AnimalPeligroso, PerroDomestico {
	
	public void muerde() {
		System.out.println("GRRRR");
	}
	public void ladra() {
		System.out.println("GUAU GUAU");
	}
	public void mueveCola() {
		System.out.println("Mueve cola");
	}
	
}
