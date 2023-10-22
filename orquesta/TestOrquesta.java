package orquesta;

public class TestOrquesta {

	public static void main(String[] args) {
		
		//instancio los instrumentos
		InstrumentoMusical i1 = new InstrumentoMusical(Categoria.CUERDAS, "guitarra");
		InstrumentoMusical i2 = new InstrumentoMusical(Categoria.PERCUSION, "bombo");
		InstrumentoMusical i3 = new InstrumentoMusical(Categoria.VIENTO, "trompeta");
		InstrumentoMusical i4 = new InstrumentoMusical(Categoria.CUERDAS, "bajo");
		InstrumentoMusical i5 = new InstrumentoMusical(Categoria.PERCUSION, "platillo");
		InstrumentoMusical i6 = new InstrumentoMusical(Categoria.VIENTO,"trombon");
		InstrumentoMusical i7 = new InstrumentoMusical(Categoria.VIENTO,"trompa");
		
		//creo la orquesta
		Orquesta o = new Orquesta();
		
		//agrego instrumentos a la orquesta
		o.agregarInstrumento(i1);
		o.agregarInstrumento(i2);
		o.agregarInstrumento(i3);
		o.agregarInstrumento(i4);
		o.agregarInstrumento(i5);
		o.agregarInstrumento(i6);
		o.agregarInstrumento(i7);
		
		//afino tres instrumentos con el luthier
		Luthier.afinar(i1.getCat());
		Luthier.afinar(i2.getCat());
		Luthier.afinar(i3.getCat());
		
		System.out.println(o.toString());
		
	}

}
