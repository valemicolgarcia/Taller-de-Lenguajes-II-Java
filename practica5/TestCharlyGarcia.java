package practica5;

public class TestCharlyGarcia {

	public static void main(String[] args) {
		
		CharlyGarcia instancia1Charly = CharlyGarcia.getInstance();
		instancia1Charly.saludar();
		
		CharlyGarcia instancia2Charly = CharlyGarcia.getInstance();
		instancia2Charly.saludar();
		
		 if (instancia1Charly == instancia2Charly){
	            System.out.println("Es la misma instancia");
	        }
	        else{
	            System.out.println("No es la misma instancia (SINGLETON)");
	        }
		
		
	}
}
