package lambdas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaIntegerTesteMain {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(13);
        integerList.add(13);
        integerList.add(113);
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
        System.out.println(ListaInteger.ignorarNumerosIguais(integerList)
            + " Mostrando apenas números diferentes - retirando os repetidos");

        // exercício 9
        System.out.println(ListaInteger.tresFuncoesJuntas(integerList)
            + " Usando as três funções anteriores" );

        // exercicio 10
        System.out.println(ListaInteger.maiorNumero(integerList) + " é o maior número.");

        // exercicio 11
        System.out.println(ListaInteger.menorNumero(integerList) + " é o menor número");

        // exercicio 12
        System.out.println(ListaInteger.somaMaiorComMenor(integerList) + " é a soma do maior com o menor valor");

        // exercicio 13
        System.out.println(ListaInteger.divisiveisPorTres(integerList) + " são divisíveis por 3");

        // exercício 14
        System.out.println(ListaInteger.transformaEmStringList(integerList) + " - Convertidos em String e separados por ;");

        // exercício 15
        System.out.println(ListaInteger.somaTodos(integerList) + " é a soma de todos os valores");

        // exercício 16
        System.out.println(ListaInteger.somaTodosOsPrimos(integerList) + " soma de todos os números primos");

        // exercicio 17
        List<BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(BigDecimal.valueOf(10.00));
        bigDecimalList.add(BigDecimal.valueOf(115.00));
        bigDecimalList.add(BigDecimal.valueOf(30.00));
        bigDecimalList.add(BigDecimal.valueOf(20.00));
        bigDecimalList.add(BigDecimal.valueOf(250.00));
        bigDecimalList.add(BigDecimal.valueOf(20.00));
        bigDecimalList.add(BigDecimal.valueOf(135.00));
        System.out.println(ListaInteger.somaListaBigDecimal(bigDecimalList) + " é a soma dos valores BigDecimals");

        // exercício 18
        System.out.println(ListaInteger.somaIntervadoDeBigDecimals(bigDecimalList) + " é a soma dos valores BigDecimals entre 0 e 100");

        // exercicio 19
        List<Integer> numPrimos = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        System.out.println(ListaInteger.integerList(numPrimos, integerList));

        // exercicio 20
        System.out.println(ListaInteger.foraDoIntegerList(numPrimos, integerList));

        // exercicio 22
        List<Integer> integers = Arrays.asList(5, 15, 25, 35, 45, 55, 65, 10, 20, 30, 40, 60, 70, 80, 90, 100);
        TInteger t1 = new TInteger("T1", integers);
        TInteger t2 = new TInteger("T2", integerList);
        List<TInteger> tIntegerList = new ArrayList<>();
        tIntegerList.add(t1);
        tIntegerList.add(t2);
        System.out.println(ListaInteger.filtroIntegerList(tIntegerList) + " = Tamanho: " + ListaInteger.filtroIntegerList(tIntegerList).size());

        // exercicio 23
        System.out.println(ListaInteger.filtroIntegerList2(tIntegerList) + " Tamanho: " + ListaInteger.filtroIntegerList2(tIntegerList).size());

        // exercicio 24
        System.out.println(ListaInteger.somaTodosT(tIntegerList) + " = Soma");
    }
}
