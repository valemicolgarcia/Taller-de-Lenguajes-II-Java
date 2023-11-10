package catalogador;

import java.util.Date;
import java.util.List;

public class SitioWeb {
	
	//COMPORTAMIENTO ----------------------------------------------------
	private String direccionWeb;
	private int contadorVisitas;
	private Date fechaCreacion;
	private List <Etiqueta> etiquetas;
	
	//GETTERS AND SETTERS------------------------------------------------
	public String getDireccionWeb() {
		return direccionWeb;
	}
	public void setDireccionWeb(String direccionWeb) {
		this.direccionWeb = direccionWeb;
	}
	public int getContadorVisitas() {
		return contadorVisitas;
	}
	public void setContadorVisitas(int contadorVisitas) {
		this.contadorVisitas = contadorVisitas;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}
	public void setEtiquetas(List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}

	
	
	
}
