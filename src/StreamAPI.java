package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String []args) {
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");
		
		// Retorna a contagem de elementos do stream
		System.out.println("Contagem: " + estudantes.stream().count());
		
		// Retorna o elemento com maior n�mero de letras
		System.out.println("Maior n�mero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		// Retorna o elemento com menor n�mero de letras
		System.out.println("Maior n�mero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
		
		// Retorna os elementos que t�m a letra R no nome
		System.out.println("Com a letra R no nome: " + estudantes.stream().filter((estudante) 
				-> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		// Retorna uma nova cole��o, com os nomes concatenados � quantidade de letras de cada nome
		System.out.println("Retorna uma nova cole��o com a quantidade de letras: " +
				estudantes.stream().map(estudante -> estudante.concat(" - ")
						.concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
		
		// Retorna somente os 3 primeiros elementos da cole��o
		System.out.println("Retorna os 3 primeiros elementos: " 
				+ estudantes.stream().limit(3).collect(Collectors.toList()));
		
		// Exibe cada elemento no console, e depois retorna a cole��o
		System.out.println("Retorna os elementos: " + estudantes.stream()
			.peek(System.out::println).collect(Collectors.toList()));
		
		// Exibe cada elementos no console sem retornar outra cole��o
		System.out.println("Retorna os elementos novamente: ");
			estudantes.stream().forEach(System.out::println);
			
		// Retorna true se todos os elementos possuem a letra W no nome
		System.out.println("Todos os elementos tem a letra W no nome? " 
				+ estudantes.stream().allMatch((elemento) -> elemento.contains("w")));
		
		// Retorna true se algum elemento possue a letra "a" min�scula no nome
		System.out.println("Tem algum elemento com a letra a min�scula no nome? " 
				+ estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
		
		// Retorna true se nenhum elemento possue a letra "a" min�scula no nome
		System.out.println("Tem algum elemento com a letra a min�scula no nome? " 
						+ estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
		
		// Retorna o primeiro elemento da cole��o, se existir exibe no console
		System.out.println("Retorna o primeiro elemento da cole��o: ");
		estudantes.stream().findFirst().ifPresent(System.out::println	);
		
	}

}
