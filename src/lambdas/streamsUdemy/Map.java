package lambdas.streamsUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
        marcas.stream().map(String::toUpperCase).forEach(print);

        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

        System.out.println("\nUsando Composição:");
        marcas.stream()
                .map(String::toUpperCase)
                .map(primeiraLetra)
                .map(n -> n + "!!! ")
                .forEach(print);
    }
}
