package lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaTesteMain {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Marcelo");
        stringList.add("Giseli");
        stringList.add("Gabriel");
        stringList.add("Jéssica");
        stringList.add("Naidion");
        stringList.add("Fernanda");
        stringList.add("Cecilia");
        stringList.add("Roberto");
        stringList.add("Romeu");
        stringList.add("Bia");

        System.out.println(stringList + " Lista original tem " + stringList.size() + " itens.");

        System.out.println(ListaString.listStringToUpperCase(stringList) + " Para UpperCase");

        System.out.println(ListaString.listStringContainsA(stringList)
                + " Tamanho da lista contendo a letra (a): "
                + ListaString.listStringContainsA(stringList).size());

        System.out.println(ListaString.listStringContainsA(ListaString.listStringSize(stringList))
                + " Tamanho da lista contendo a letra (a) e String´s entre size 4 e 7: "
                + ListaString.listStringContainsA(ListaString.listStringSize(stringList)).size());



    }
}
