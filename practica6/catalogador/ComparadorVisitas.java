package catalogador;

import java.util.Comparator;

public class ComparadorVisitas implements Comparator <SitioWeb> {
	
	public int compare(SitioWeb s1, SitioWeb s2) {
		return (Integer.compare(s1.getContadorVisitas(), s2.getContadorVisitas()));
	}
	
}
