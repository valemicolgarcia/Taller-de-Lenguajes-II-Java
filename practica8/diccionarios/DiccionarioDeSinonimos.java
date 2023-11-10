package diccionarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiccionarioDeSinonimos {
	
	private Map <String,List<String>> diccionario = new HashMap<>();

	public DiccionarioDeSinonimos() {
		super();
		this.diccionario.put("sillon",new ArrayList<> (Arrays.asList("asiento","butaca","silla")));
		this.diccionario.put("casa",new ArrayList<> (Arrays.asList("edificacion","inmueble","hogar","obra")));
		this.diccionario.put("libro",new ArrayList<> (Arrays.asList("ejemplar","manual","texto","obra")));
		this.diccionario.put("computador",new ArrayList<> (Arrays.asList("equipo","ordenador","pc")));
	}
	
	public Map<String, List<String>> getDiccionario() {
		return diccionario;
	}
	
	public void setDiccionario(Map<String, List<String>> diccionario) {
		this.diccionario = diccionario;
	}
	
	public List<String> getSinonimos(String palabra) {
		
		for (String clave: diccionario.keySet()) {
			if (clave == palabra) {
				List<String> sinonimos = diccionario.getOrDefault(palabra, new ArrayList<>());
				return sinonimos;
			}
		}
		return null;
	}
	
	public void imprimirClaves() {
		for (String name: diccionario.keySet()) {
			System.out.println(name);
		}
	}
	
	public void imprimirDiccionario() {
		for (String name: diccionario.keySet()) {
			System.out.println("CLAVE: " +  name);
			System.out.println("SINONIMOS: " + diccionario.getOrDefault(name, new ArrayList<>()));
		}
	}
	
}
