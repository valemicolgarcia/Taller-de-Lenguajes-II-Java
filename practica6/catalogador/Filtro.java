package catalogador;

import java.util.List;

public interface Filtro <T>{
	List<T> aplicarFiltro(TipoFiltro f);
	
}
