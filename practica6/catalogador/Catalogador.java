package catalogador;

import java.util.ArrayList;
import java.util.List;

public class Catalogador implements Filtro<SitioWeb> {

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

	@Override
	public List<SitioWeb> aplicarFiltro(TipoFiltro f) {

		List<SitioWeb> filtrados = new ArrayList<>();

		for (SitioWeb s : catalogos) {

			if (f == TipoFiltro.CULTURAL) {
				if (s.getEtiquetas().contains(Etiqueta.CULTURAL)) {
					filtrados.add(s);
				}
			} else {
				if (f == TipoFiltro.ETIQUETAS30) {
					if (s.getEtiquetas().size() > 30) {
						filtrados.add(s);
					}
				} else {
					if (f == TipoFiltro.WEBMAYOR100) {
						if (s.getContadorVisitas() > 1000) {
							filtrados.add(s);
						}
					}
				}
			}
		}
		return filtrados;
	}
	
	public List<SitioWeb> obtenerCatalogo (TipoFiltro filter, TipoComparacion c){
		List<SitioWeb> catalogo = this.aplicarFiltro(filter);
		
		TipoComparacion orden = null;
		switch(orden) {
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
