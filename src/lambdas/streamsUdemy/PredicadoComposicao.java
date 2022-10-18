package lambdas.streamsUdemy;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num > 99 && num < 1000;

        System.out.println(isPar.and(isTresDigitos).test(122));

        System.out.println(isPar.or(isTresDigitos).test(123));


    }
}
