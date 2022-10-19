package lambdas.streamsUdemy;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(7.5, 8.5));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = (n1 + n2) /2;
            return notaFinal >= 7.0 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(8.5, 9.5));

    }
}
