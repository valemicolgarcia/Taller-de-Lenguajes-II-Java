package hashset;

import java.util.ArrayList;
import java.util.List;

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSetCuentaAgregados <String> hash = new HashSetCuentaAgregados <String>();
		
		//creo una coleccion para agregarsela al hashset
		List <String> tropa = new ArrayList<>();
		tropa.add("dolo");
		tropa.add("bau");
		tropa.add("joa");
		tropa.add("tibu");
		tropa.add("taci");
		tropa.add("mago");
		System.out.println("La coleccion (lista) esta compuesta por los integrantes de la tropa: " + tropa.toString());
		
		hash.addAll(tropa);
		
		System.out.println("\nEl hash esta compuesto por " + hash.toString());
		
		System.out.println("\nLa cantidad de elementos agregados es de: " + hash.getCantidadAgregados());
		
		//el metodo addAll internamente cuenta la cantidad de elementos del hash
		
	}

}
