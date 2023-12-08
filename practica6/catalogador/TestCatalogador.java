package catalogador;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestCatalogador {

	public static void main(String[] args) {
		
		SitioWeb sitioWeb1 = new SitioWeb ("vale",1001,new Date(),Arrays.asList(Etiqueta.CULTURAL));
		SitioWeb sitioWeb2 = new SitioWeb ("hola",20,new Date(),Arrays.asList(Etiqueta.DEPORTIVO));
		
		Catalogador catalogador = new Catalogador (Arrays.asList(sitioWeb1, sitioWeb2));
		
		List<SitioWeb> sitios = catalogador.obtenerCatalogo(new FiltradorPorPalabraCultural(), TipoComparacion.VISITAS) ;
		for (SitioWeb s: sitios) {
			System.out.println(s.getDireccionWeb());
		}
	}

}
