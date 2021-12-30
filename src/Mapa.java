package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main (String[] args) {
		Map<String, String> estados = new HashMap<String, String>();
		
		estados.put("RS", "Rio Grande do Sul");
		estados.put("SC", "Santa Catarina");
		estados.put("PR", "Paraná");
		estados.put("MG", "Minas Gerais");		
		System.out.println(estados);
		
		estados.remove("MG");
		System.out.println(estados);
		
		estados.put("DF", "Distrito Federal");
		System.out.println(estados);
		
		System.out.println(estados.size());
		
		for(String valor : estados.keySet()) {
			System.out.println(estados.get(valor)+" "+valor);
		}
	}
}
