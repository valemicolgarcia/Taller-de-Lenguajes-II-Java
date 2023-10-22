package sistemaSolar2;

public class Planeta {
	
	//ESTADO
	private int cantLunas;
	private TipoPlaneta tipo;
	private double diametro;
	private long distanciaAlSol;
	
	//CONSTRUCTORES: permiten definir el estado inicial de un objeto al momento de su creacion
	
	//CONSTRUCTOR NULO
	public Planeta() {
		
	}
	//CONSTRUCTOR CON PARAMETROS
	public Planeta(int cantLunas, TipoPlaneta tipo, double diametro, long distanciaAlSol) {
		super();
		this.cantLunas = cantLunas;
		this.tipo = tipo;
		this.diametro = diametro;
		this.distanciaAlSol = distanciaAlSol;
	}
	
	
	//COMPORTAMIENTO
	public int getCantLunas() {
		return cantLunas;
	}
	
	public void setCantLunas(int cantLunas) {
		this.cantLunas = cantLunas;
	}
	
	public TipoPlaneta getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoPlaneta tipo) {
		this.tipo = tipo;
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	public long getDistanciaAlSol() {
		return distanciaAlSol;
	}
	
	public void setDistanciaAlSol(long distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}
	@Override
	public String toString() {
		return "Planeta [cantLunas=" + cantLunas + ", tipo=" + tipo + ", diametro=" + diametro + ", distanciaAlSol="
				+ distanciaAlSol + "]";
	}
	
	
	
	
	
}
