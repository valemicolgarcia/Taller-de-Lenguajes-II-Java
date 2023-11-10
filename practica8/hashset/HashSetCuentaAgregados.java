package hashset;

import java.util.Collection;
import java.util.HashSet;

public class HashSetCuentaAgregados<E> extends HashSet<E> {

	private static final long serialVersionUID = 1L; // esto se me agrego solo no se por que me lo piden

	private int cantidadAgregados = 0;

	public HashSetCuentaAgregados() {
	}

	public HashSetCuentaAgregados(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override
	public boolean add(E e) {
		cantidadAgregados++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// this.cantidadAgregados += c.size();
		// el metodo addAll internamente incrementa la variable
		// la clase hashSet mantiene una variable llamada size que representa el numero
		// de elementos del conjunto
		return super.addAll(c);
	}

	public int getCantidadAgregados() {
		return cantidadAgregados;
	}

}
