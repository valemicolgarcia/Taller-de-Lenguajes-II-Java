package practica5;

public class CharlyGarcia {
	
	//PATRON SINGLETON: Restringe la instancia de la clase y asegura que solamente una instancia de la clase 
	//exista en la maquina virtual JAVA.
	
	//variable privada de clase del tipo de la clase
	private static CharlyGarcia INSTANCE = new CharlyGarcia();
	
	//constructor privado para evitar la creacion de objetos desde otras clases
	private CharlyGarcia() {
		
	}
	
	//metodo publico de clase que retorne dicha instancia
	public static CharlyGarcia getInstance() {
		return INSTANCE;
	}
	
	public void saludar() {
		System.out.println("Hola!");
	}
	
}
