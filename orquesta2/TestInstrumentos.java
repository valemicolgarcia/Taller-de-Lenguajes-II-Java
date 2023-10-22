package orquesta2;

public class TestInstrumentos {

	public static void main(String[] args) {
		
		//creo la orquesta
		Orquesta o = new Orquesta();
		
		//creo los instrumentos
		Cuerdas c1 = new Cuerdas("guitarra");
		Cuerdas c2 = new Cuerdas("bajo");
		Viento v1 = new Viento("trompeta");
		Viento v2 = new Viento("trompa");
		Viento v3 = new Viento("trombon");
		Percusion p1 = new Percusion ("bombo");
		Percusion p2 = new Percusion ("platillo");
		
		//agrego los instrumentos a la orquesta
		o.agregarInstrumento(c1);
		o.agregarInstrumento(c2);
		o.agregarInstrumento(p1);
		o.agregarInstrumento(p2);
		o.agregarInstrumento(v1);
		o.agregarInstrumento(v2);
		o.agregarInstrumento(v3);
		
		System.out.println(o.toString()); //la afinacion esta en null
		
		for (InstrumentoMusical ins : o.getOrquesta()) {
			System.out.println(ins.getNombre());
			Luthier.afinar(ins);
		}
		
		System.out.println(o.toString()); //ahora se afinaron los instrumentos
		
		
	}

}
