package practica5;

public class TestRandom {

	public static void main (String args[]) {
		
		/*
		Escriba una clase llamada TestRandom. Su método main verificará el correcto
		funcionamiento de la clase GeneraRandom invocando 100 veces a obtenerRandom().
		 */
	
		for (int i=0; i<5 ; i++) {
			int num = GeneraRandom.obtenerRandom();
			System.out.println("El numero random es " + num);
		}
		
		/*
		 ¿Es posible crear una instancia de GeneraRandom y enviarle mensajes de clase? Si su
		respuesta es afirmativa, indique si esto es correcto. Si su respuesta es negativa,
		indique por qué. En ambos casos JUSTIFIQUE.
		 */
		
		GeneraRandom g = new GeneraRandom();
		for (int i=0; i<5; i++) {
			int numero = g.obtenerRandom();
			System.out.println("numero");
		}
		
		//a los metodos de clase (static) se puede acceder a traves del nombre de la clase, no hay que crear instancias
		//poder se puede pero no es conceptualmente correcto.
		
		/* 
		La clase Math está definida como public final class Math.
		i. ¿Qué nos está indicando con esta definición?
		
		una clase final es una clase que no puede ser heredada por otras clases. Cuando una clase
		se declara como final, significa que no se puede crear una subclase que extienda o herede
		sus propiedades y comportamientos
		
		ii. ¿Conoce alguna otra clase de la API con esta misma definición?
		
		System - Scanner - String - Math - Byte - Short - Integer - Long
		Float - Double - Boolean - Character
		
		c. Modifique la clase GeneraRandom de modo que no permita subclases ni sobreescritura de
		sus métodos.
	
		public final class GeneraRandom()
		
		d. Modifique la clase GeneraRandom de modo que no permita la generación de instancias.
		
		public abstract class GeneraRandom()
		
		e. Desde el eclipse, exporte las clases GeneraRandom y TestRandom en un archivo
		JAR que ejecute el método main de TestRandom 
		i. ¿Qué archivo nuevo se generó dentro del JAR?
		ii. Ejecute el archivo JAR generado.
		
		 */
		
		
		
	}
	
}
