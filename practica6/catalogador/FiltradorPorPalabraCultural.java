package catalogador;

import java.util.ArrayList;
import java.util.List;

public class FiltradorPorPalabraCultural implements Filtro{

	@Override
	public List<SitioWeb> filtrar(List<SitioWeb> lista) {
		
		
		List<SitioWeb> filtrados = new ArrayList<>();
		for (SitioWeb sitioWeb : lista) {
			if (sitioWeb.getEtiquetas().contains(Etiqueta.CULTURAL)) {
				filtrados.add(sitioWeb);
			}
		}

		return filtrados;
		
	
	}

}
