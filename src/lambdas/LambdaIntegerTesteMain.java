package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaIntegerTesteMain {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(13);
        integerList.add(15);
        integerList.add(27);
        integerList.add(9);
        integerList.add(7);
        integerList.add(19);
        integerList.add(35);
        integerList.add(3);

        System.out.println(integerList + " Lista original tem " + integerList.size() + " itens.");

        // exercicio 4
        System.out.println(ListaInteger.integerPrimosList(integerList)
            + " Tamanho da lista contendo somente números primos: "
            + ListaInteger.integerPrimosList(integerList).size());

        // exercício 5
        System.out.println(ListaInteger.paresCalculados(integerList)
            + " Tamanho da lista (impares*2 e pares*3: "
            + ListaInteger.paresCalculados(integerList).size());

        // exercício 6
        System.out.println(ListaInteger.ignoraDoisPrimeiros(integerList)
            + " Tamanho da lista ignorando os dois primeiros String´s: "
            + ListaInteger.ignoraDoisPrimeiros(integerList).size());

        // exercício 7
        System.out.println(ListaInteger.mostraCincoPrimeiros(integerList)
            + " Mostrando os 5 primeiros da lista");

        // exercicio 8
        System.out.println(ListaInteger.ignorarNumerosIquais(integerList)
            + "Mostrando apenas números diferentes - retirando os repetidos");


    }
}
