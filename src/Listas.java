
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
	public static void main (String[]args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Juliana");
		lista.add("Pedro");
		lista.add("Carlos");
		lista.add("Larissa");
		lista.add("Joao");		
		System.out.println(lista);
		
		lista.set(2, "Roberto");
		System.out.println(lista);
		
		String nome1 = lista.get(1);
		System.out.println(nome1);
		
		lista.remove(4);
		System.out.println(lista);
		
		System.out.println(lista.size());
		
		boolean existeJuliana = lista.contains("Juliana");
		System.out.println(existeJuliana);
		
		List<String> lista2 = new ArrayList<>();
		lista2.add("Ismael");
		lista2.add("Rodrigo");
		
		lista2.addAll(lista);
		System.out.println(lista2);
		
		Collections.sort(lista2);
		System.out.println(lista2);
		
		boolean listaVazia = lista2.isEmpty();
		System.out.println(listaVazia);
		
	}
}
