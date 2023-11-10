package paresGenericos;

public class TestParOrdenado {

	public static void main(String[] args) {

		ParOrdenado<String, Boolean> par = new ParOrdenado<>("vale", true);
		System.out.println("A --> " + par.getA());
		System.out.println("B --> " + par.getB());
		ParOrdenado <String,Boolean> par2 = new ParOrdenado<>("vale", false);
		int resultado = par.compareTo(par2);
		System.out.println("El resultado de la comparacion de los pares ordenados es: " + resultado);
		
		
		
	}

}
