package lambdas.streamsUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        Stream<String> linguagens = Stream.of("Java ", "Lua ", "JS \n");
        linguagens.forEach(print);

        String[] maisLinguagens = {"Python ", "Lisp ", "Perl ", "Go \n"};

        Stream.of(maisLinguagens).forEach(print);
        Arrays.stream(maisLinguagens).forEach(print);
        Arrays.stream(maisLinguagens, 1, 3).forEach(print); // Inicia no índice 1 e termina no índice 3

        List<String> outrasLinguagens = Arrays.asList("\nC ", "PHP ", "Kotlin \n");
        outrasLinguagens.stream().forEach(print);
        outrasLinguagens.parallelStream().forEach(print);

        // Stream.generate(() -> "a").forEach(print); // imprime infinitamente a letra "a"
        Stream.iterate(0, n -> n + 1).forEach(println); // gera números de 0 até infinito, somando de 1 em 1
        
    }
}
