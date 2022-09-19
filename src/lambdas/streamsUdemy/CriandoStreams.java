package lambdas.streamsUdemy;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> linguagens = Stream.of("Marcelo ", "Giseli ", "Jéssica ", "Gabriel \n");
        linguagens.forEach(print);



    }
}
