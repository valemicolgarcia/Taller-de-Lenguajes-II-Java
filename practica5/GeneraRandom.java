package practica5;

public class GeneraRandom {
	public static final int CONSTANTE = 10;
	
	//constructor vacio asi se puede instanciar
	GeneraRandom(){
	}
	
	/* Un método de clase llamado obtenerRandom que devuelve un valor entero,
	considerando que sea mayor o igual que cero y menor o igual que el valor máximo
	especificado en el punto i.  */
	
	public static int obtenerRandom () {
		double nro = Math.random(); //uso la clase math que me tire random en doble
		//el random de la clase math tira numeros entre 0 y 1
		nro = nro * CONSTANTE; //la multiplico por la cte para sacar los decimales
		int numero = (int) nro; //convierto a int
	//	System.out.println("El numero es " + numero);
		if ( (numero > 0)&& (numero < CONSTANTE)) { //verifico que sea mayor que 0 y menor que el maximo
			return numero;
		} else
			return -1;
	}
	
	
	
}
