package practica5;

public class Gato extends Animal{
	
	/*
	Cuando sobreescribes un método en una subclase, generalmente debes mantener la misma visibilidad (public, protected, private) 
	que tenía el método en la clase base. Esto se debe a que la visibilidad del método en la clase base 
	establece el nivel de acceso que otros objetos tendrán al método, y cambiarlo podría romper la encapsulación
	 */
	
//	private void saludo() --> estoy reduciendo la visibilidad y no es posible
	protected void saludo() {
		System.out.println("Miau!");
	}
	
	//podria ponerle public
}
