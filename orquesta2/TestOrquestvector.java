package orquesta2;

public class TestOrquestvector {

	public static void main(String[] args) {
		
		//creo la orquesta
		Orquestavector o = new Orquestavector();
		System.out.println(o.toString());
		for (InstrumentoMusical ins : o.getOrq()) {
			System.out.println(ins.getNombre());
			Luthier.afinar(ins);
		}
		System.out.println(o.toString());
		
		
		

	}

}
