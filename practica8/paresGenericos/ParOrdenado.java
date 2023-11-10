package paresGenericos;

public class ParOrdenado <X extends Comparable<? super X>,Y extends Comparable<? super Y>> implements Comparable<ParOrdenado<X,Y>> {
	
	//ESTADO
	private X a;
	private Y b;
	
	//CONSTRUCTOR
	public ParOrdenado(X a, Y b) {
		this.a = a;
		this.b = b;
	}
	
	//GETTERS AND SETTERS
	public X getA() {
		return a;
	}
	
	public void setA(X a) {
		this.a = a;
	}
	
	public Y getB() {
		return b;
	}
	
	public void setB(Y b) {
		this.b = b;
	}

	@Override
	public int compareTo(ParOrdenado<X, Y> o) {
		
		int nro = this.a.compareTo(o.getA());
		if (nro == 0) {
			return (this.b.compareTo(o.getB()));
		} 
		else {
			return nro;
		}
	}

	

	
	}

	
	
	
	
	

