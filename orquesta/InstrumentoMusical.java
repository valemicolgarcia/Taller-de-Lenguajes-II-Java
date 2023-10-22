package orquesta;

public class InstrumentoMusical {
	
	//ESTADO
	private Categoria cat;
	private String nombre;
	
	//CONSTRUCTOR NULO
	public InstrumentoMusical () {
		
	}
	
	//CONSTRUCTOR CON PARAMETROS
	public InstrumentoMusical(Categoria cat, String nombre) {
		super();
		this.cat = cat;
		this.nombre = nombre;
	}
	
	
	//GETTERS AND SETTERS
	public Categoria getCat() {
		return cat;
	}
	
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
