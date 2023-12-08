package practica6;

import java.util.Arrays;

public class TestPersona {

	public static void main(String[] args) {
		
		//arreglo de personas
		Persona personas []	= new Persona [2];
		personas[0]= new Persona ("Vale", "Garcia", 19);
		personas [1] = new Persona ("Loli", "Garro", 23);
		
		System.out.println("Impresion del arreglo de personas sin ordenar \n");
		
		for (int i = 0; i< personas.length; i++) {
			System.out.println(personas[i].toString());
		}
		
		//ordeno por nombre y apellido
		Arrays.sort(personas);
		
		System.out.println("\nImpresion del arreglo de personas ordenado \n");
		for (int i = 0; i< personas.length; i++) {
			System.out.println(personas[i].toString());
		}
		
		//arreglo de empleados
		Empleado empleados [] = new Empleado [2];
		empleados [0] = new Empleado ("Val", "Garcia", 19, 03404, 20000);
		empleados [1] = new Empleado ("Val", "Garcia", 19, 01112, 100);
		
		System.out.println("\nImpresion del arreglo de empleados no ordenado \n");
		
		for (int i = 0; i< empleados.length; i++) {
			System.out.println(empleados[i].toString());
		}
		
		//ordeno el arreglo
		Arrays.sort(empleados);
		
		System.out.println("\nImpresion del arreglo de empleados ordenado \n");
		
		for (int i = 0; i< empleados.length; i++) {
			System.out.println(empleados[i].toString());
		}
	
		//System.out.println(empleados[0].compareTo(empleados[1]));
		
		Arrays.sort(empleados, new ComparadorSueldo());
		System.out.println("\nImpresion del arreglo ordenado solo por sueldo\n");
		for (int i = 0; i< empleados.length; i++) {
			System.out.println(empleados[i].toString());
		}
		
		
	}

}
