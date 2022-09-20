package lambdas.streamsUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

import static java.util.stream.Collectors.toList;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Lista inicial: " + integerList);

        List<String> stringList = integerList.stream().map(Integer::toBinaryString).toList();
        System.out.println(stringList);

        UnaryOperator<String> reverter = s -> new StringBuilder(s).reverse().toString();

        List<String> stringList1 = stringList.stream().map(reverter).toList();
        System.out.println(stringList1);


    }
}

