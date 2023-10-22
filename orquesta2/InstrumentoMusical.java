package orquesta2;

public abstract class InstrumentoMusical {
	
	//ESTADO
	private String nombre;
	private TipoInstrumento tipo;
	private TipoAfinacion afinacion;
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoInstrumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoInstrumento tipo) {
		this.tipo = tipo;
	}

	public TipoAfinacion getAfinacion() {
		return afinacion;
	}

	public void setAfinacion(TipoAfinacion afinacion) {
		this.afinacion = afinacion;
	}
	
	//CONSTRUCTOR NULO
	public InstrumentoMusical() {
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public InstrumentoMusical(String nombre, TipoInstrumento tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	
	
	
	@Override
	public String toString() {
		return "InstrumentoMusical [nombre=" + nombre + ", tipo=" + tipo + ", afinacion=" + afinacion + "]";
	}

	//METODOS ABSTRACTOS
	public abstract void afinar(TipoAfinacion nota);
	
	
	
	
}
