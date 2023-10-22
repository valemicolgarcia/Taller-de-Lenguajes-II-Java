package sistemaSolar2;

public class TestSistemaSolar {

	public static void main(String[] args) {
		
		SistemaSolar sistema = SistemaSolar.getInstance();
		
		//CREACION DE PLANETAS
		Planeta jupiter = new Planeta(10,TipoPlaneta.GASEOSO, 4.2, 55);
		Planeta marte = new Planeta(1, TipoPlaneta.ROCOSO, 4.2, 1);
		Planeta neptuno = new Planeta(5, TipoPlaneta.GASEOSO, 1.1, 2);
		Planeta saturno = new Planeta(1, TipoPlaneta.ROCOSO, 1.2, 54);
		
		//agrego planetas al sistema solar
		sistema.agregarPlaneta(jupiter);
		sistema.agregarPlaneta(marte);
		sistema.agregarPlaneta(neptuno);
		sistema.agregarPlaneta(saturno);
		
		System.out.println(sistema.toString());
		
		//prueba del telescopio
		System.out.println("La distancia de neptuno al sol es: " + Telescopio.distancia(neptuno));
		Telescopio.tipo(marte);
		
	}

}
