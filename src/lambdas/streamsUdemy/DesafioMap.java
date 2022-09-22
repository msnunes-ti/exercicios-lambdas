package lambdas.streamsUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Lista inicial: " + integerList);

        // Passar a sequência de Integer para Binários
        List<String> stringList = integerList.stream().map(Integer::toBinaryString).toList();
        System.out.println(stringList);

        // Inverter cada sequência de binários
        UnaryOperator<String> reverter = s -> new StringBuilder(s).reverse().toString();

        List<String> stringList1 = stringList.stream().map(reverter).toList();
        System.out.println(stringList1);

        // Transformar os números invertidos para Integer novamente
        Function<String, Integer> BinarioToInteger = s -> Integer.parseInt(s, 2);

        List<Integer> integerList1 = stringList1.stream().map(BinarioToInteger).toList();
        System.out.println(integerList1);


        // TUDO na MESMA Função:
        integerList.stream()
                .map(Integer::toBinaryString)
                .map(reverter)
                .map(BinarioToInteger)
                .forEach(System.out::println);
    }
}

