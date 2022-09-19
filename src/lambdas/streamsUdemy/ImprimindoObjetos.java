package lambdas.streamsUdemy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Gabriel", "Giseli", "Jéssica", "Teste", "Marcelo");

        System.out.println("Usando o foreach:");
        for(String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator:");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase().replace("TESTE", "TROCADO"));
        }

        System.out.println("\nUsando Stream:");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
    }

}
