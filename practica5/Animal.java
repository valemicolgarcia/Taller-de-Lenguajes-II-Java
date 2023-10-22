package practica5;

abstract public class Animal {
	//un metodo abstracto es un metodo que no tiene implementacion, sirve para definir un comportamiento comun 
	//para todos los objetos de las subclases concretas
	
	//el acceso protected hace que pueda ser accedido por todas las subclases, sin importar su paquete 
	//ademas le da acceso package
	
	abstract protected void saludo();
}
