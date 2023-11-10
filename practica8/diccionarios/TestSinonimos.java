package diccionarios;

public class TestSinonimos {

	public static void main(String[] args) {
		
		DiccionarioDeSinonimos d = new DiccionarioDeSinonimos ();
		System.out.println("Impresion de las claves del diccionario \n");
		d.imprimirClaves();
		System.out.println("\nImpresion de los sinonimos de la palabra sillon\n");
		System.out.println(d.getSinonimos("sillon"));
		System.out.println("\nImpresion de todo el diccionario\n");
		d.imprimirDiccionario();
		
		DiccionarioOrdenado dic = new DiccionarioOrdenado();
		System.out.println("\nImpresion de las claves del diccionario ordenado\n");
		dic.imprimirClaves();
		System.out.println("\nImpresion de todo el diccionario ordenado\n");
		dic.imprimirDiccionario();
		
	}

}
