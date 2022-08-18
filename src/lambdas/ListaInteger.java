package lambdas;

import java.util.List;

public class ListaInteger {

    private static Boolean isPrimo(Integer integer) {
        for (Integer i = 2; i < integer; i++ ) {
            if (integer % i == 0)
                return false;
        }
        return true;
    }
    public static List<Integer> integerPrimosList(List<Integer> integerList) {
        return integerList.stream().filter(ListaInteger::isPrimo).toList();
    }

    private static List<Integer> calcularInteger(List<Integer> integerList) {
        return integerList.stream().map(i -> i % 2 == 0 ? i * 3 : i * 2).toList();
    }
    public static List<Integer> paresCalculados(List<Integer> integerList) {
        return calcularInteger(integerList).stream().filter(i -> i % 2 == 0).toList();
    }

    public static List<Integer> ignoraDoisPrimeiros(List<Integer> integerList) {
        return integerList.stream().skip(2).toList();
    }

    public static List<Integer> mostraCincoPrimeiros(List<Integer> integerList) {
        return integerList.stream().limit(5).toList();
    }

    public static List<Integer> ignorarNumerosIquais(List<Integer> integerList) {
        return integerList.stream().distinct().toList();
    }




}
