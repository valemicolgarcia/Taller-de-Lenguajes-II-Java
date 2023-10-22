package unlp.info.math;
import java.util.Scanner;

public class TestNumeroComplejo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese parte real del numero complejo");
		double real1 = scanner.nextDouble();
		System.out.println("Ingrese parte imaginaria del numero complejo");
		double imaginaria1 = scanner.nextDouble();
		
		Complex num1 = new Complex (real1, imaginaria1);
		
		System.out.println("Ingrese parte real del numero complejo");
		double real2 = scanner.nextDouble();
		System.out.println("Ingrese parte imaginaria del numero complejo");
		double imaginaria2 = scanner.nextDouble();
		
		Complex num2 = new Complex (real2, imaginaria2);
		
		System.out.println(num1.toString());
		num1.add(num2);
		System.out.println(num1.toString());
		num1.subtract(num2);
		System.out.println(num1.toString());
		
		scanner.close();
	}

}
