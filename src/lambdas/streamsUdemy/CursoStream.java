package lambdas.streamsUdemy;

import java.util.function.Predicate;

public class CursoStream {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = produto -> (produto.getValor() * (1 - produto.getDesconto())) >= 750;
        Produto produto = new Produto("Notebook", 3240.00, 0.05);
        System.out.println(produto);
        System.out.println("O produto é caro? " + isCaro.test(produto));

        }
}
