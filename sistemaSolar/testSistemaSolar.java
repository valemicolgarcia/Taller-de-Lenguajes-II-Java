package sistemaSolar;
import java.util.Scanner;

public class testSistemaSolar {

	public static void main(String[] args) {
		
		SistemaSolar sistema= SistemaSolar.getInstance(); //instancia 1 de sistema solar
		SistemaSolar sistema2= SistemaSolar.getInstance();
		
		//VERIFICACION DEL PATRON DE DISEÑO SINGLETON
		if (sistema == sistema2) {
			System.out.println("Es la misma instancia. SINGLETON");
		}else {
			System.out.println("No es la misma instancia");
		}
		
		//CREO PLANETAS Y LOS METO EN LA LISTA
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese nombre del planeta");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese cantidad de lunas");
		int cantLunas = scanner.nextInt();
		System.out.println("Ingrese diametro del planeta");
		int diametro = scanner.nextInt();
		
		Gaseoso jupiter = new Gaseoso(nombre,cantLunas,diametro);
		sistema.agregarPlaneta(jupiter); //esto debe ser accedido de forma estatica esta bien???
		
		System.out.println(sistema.toString());
		
		
		
		scanner.close();
	//	System.out.println(jupiter.toString());
		
		
	}

}
