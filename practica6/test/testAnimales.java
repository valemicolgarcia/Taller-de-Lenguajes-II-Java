package test;

import animal.PerroPeligroso;
import animalespeligrosos.AnimalPeligroso;
import domestico.PerroDomestico;

public class testAnimales {

	public static void main(String[] args) {

		// todos los perro peligroso son animal peligroso
		// todos los perro peligroso son perro domemestico

		// PerroDomestico gordo = new PerroPeligroso();
		// si la instancio asi, restrinjo los metodos a los de animal domestico, los de
		// peligroso quedan inutilizables

		PerroPeligroso gordo = new PerroPeligroso();
		gordo.ladra();
		gordo.mueveCola();
		gordo.muerde();

		PerroPeligroso rita = new PerroPeligroso();

		// AnimalPeligroso rita = new PerroPeligroso();
		// si la instancio asi restrinjo los metodos a los del animal peligoroso nomas y
		// no puedo usar lo de domestico

		rita.muerde();
		rita.ladra();
		rita.mueveCola();

	}

}
