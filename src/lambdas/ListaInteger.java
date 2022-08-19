package lambdas;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public static List<Integer> ignorarNumerosIguais(List<Integer> integerList) {
        return integerList.stream().distinct().toList();
    }

    public static List<Integer> tresFuncoesJuntas(List<Integer> integerList) {
        return mostraCincoPrimeiros(ignorarNumerosIguais(ignoraDoisPrimeiros(integerList)));
    }

    public static Integer maiorNumero(List<Integer> integerList) {
        return integerList.stream().max(Integer::compare).get();
    }

    public static Integer menorNumero(List<Integer> integerList) {
        return integerList.stream().min(Integer::compare).get();
    }

    public static Integer somaMaiorComMenor(List<Integer> integerList) {
        Integer menor = menorNumero(integerList);
        Integer maior = maiorNumero(integerList);
        return menor + maior;
    }

    public static Long divisiveisPorTres(List<Integer> integerList) {
        return integerList.stream().filter(i -> i % 3 == 0).toList().stream().count();
    }

    public static String transformaEmStringList(List<Integer> integerList) {
        return integerList.stream().map(String::valueOf).collect(Collectors.joining("; "));
    }

    public static Integer somaTodos(List<Integer> integerList) {
        return integerList.stream().mapToInt(Integer::intValue).sum();
    }

    public static Integer somaTodosOsPrimos(List<Integer> integerList) {
        return integerList.stream().filter(ListaInteger::isPrimo).mapToInt(Integer::intValue).sum();
    }

    public static BigDecimal somaListaBigDecimal(List<BigDecimal> bigDecimalList) {
        return bigDecimalList.stream().reduce(BigDecimal::add).get();
    }

    // ARRUMAR
    public static BigDecimal somaIntervadoDeBigDecimals(List<BigDecimal> bigDecimalList) {
        return bigDecimalList.stream().reduce(BigDecimal::add).get();
    }

    

}
