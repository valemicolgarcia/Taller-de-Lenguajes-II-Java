package catalogador;

import java.util.ArrayList;
import java.util.List;

public class Catalogador {

	// COMPORTAMIENTO
	private List<SitioWeb> catalogos;

	// CONSTRUCTOR VACIO
	public Catalogador() {
		super();
	}

	// CONSTRUCTOR CON PARAMETROS
	public Catalogador(List<SitioWeb> catalogos) {
		super();
		this.catalogos = catalogos;
	}

	// GETTERS AND SETTERS
	public List<SitioWeb> getCatalogos() {
		return catalogos;
	}

	public void setCatalogos(List<SitioWeb> catalogos) {
		this.catalogos = catalogos;
	}

	
	public List<SitioWeb> aplicarFiltro(Filtro filtro) {
		return filtro.filtrar(catalogos);
		
	}
	
	public List<SitioWeb> obtenerCatalogo (Filtro filtro, TipoComparacion c){
		List<SitioWeb> catalogo = this.aplicarFiltro(filtro);
		
	//	TipoComparacion orden = null;
		switch(c) {
		case VISITAS:
			catalogo.sort(new ComparadorVisitas());
			break;
		case ETIQUETAS:
			catalogo.sort(new ComparadorEtiquetas());
			break;
		}
		
		return catalogo;
	}
	

}
