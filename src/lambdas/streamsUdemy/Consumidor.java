package lambdas.streamsUdemy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimirNome = p -> System.out.println(p.getNome() + "!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Lapis", 2.34, 0.29);
        Produto p3 = new Produto("Notebook", 3412.34, 0.12);
        Produto p4 = new Produto("Borracha", 1.45, 0.10);
        Produto p5 = new Produto("Caderno", 17.45, 0.11);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.getValor()));
        produtos.forEach(System.out::println);

    }
}
