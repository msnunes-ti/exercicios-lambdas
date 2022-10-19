package lambdas.streamsUdemy;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.lang.Double.parseDouble;

public class Desafio {

    public static void main(String[] args) {


        Function<Produto, Double> precoFinal = prod -> prod.getValor() * (1 - prod.getDesconto());
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500.0 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arrendondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
        Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrendondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é " + preco);
    }
}
