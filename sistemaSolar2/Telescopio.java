package sistemaSolar2;

public class Telescopio {
	
	public static Long distancia (Planeta p) {
		Long dist = p.getDistanciaAlSol();
		return dist;
	}
	
	public static void tipo (Planeta p) {
		switch (p.getTipo()) {
			case ROCOSO:{
				System.out.println("El planeta es de tipo rocoso");
				break;
			}
			case GASEOSO: {
				System.out.println("El planeta es de tipo gaseoso");
				break;
			}
		}
	}
	
	
}
