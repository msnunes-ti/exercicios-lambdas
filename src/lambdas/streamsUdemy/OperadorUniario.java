package lambdas.streamsUdemy;

import java.util.function.UnaryOperator;

public class OperadorUniario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;
        System.out.println(maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0));

        System.out.println(aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0));

    }
}
