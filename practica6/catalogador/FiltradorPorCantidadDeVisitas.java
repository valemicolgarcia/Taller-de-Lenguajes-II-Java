package catalogador;

import java.util.ArrayList;
import java.util.List;

public class FiltradorPorCantidadDeVisitas implements Filtro {

	@Override
	public List<SitioWeb> filtrar(List<SitioWeb> lista) {

		List<SitioWeb> filtrados = new ArrayList<>();
		for (SitioWeb sitioWeb : lista) {
			if (sitioWeb.getContadorVisitas() > 1000) {
				filtrados.add(sitioWeb);
			}
		}

		return filtrados;
	}
}
