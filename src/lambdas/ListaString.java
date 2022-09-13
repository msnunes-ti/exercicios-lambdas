package lambdas;

import java.util.List;

public class ListaString {

    // exercicio 1
    public static List<String> listStringToUpperCase(List<String> stringList) {
        return stringList.stream().map(String::toUpperCase).toList();
    }

    // exercicio 2
    public static List<String> listStringContainsA (List<String> stringList) {
        return stringList.stream().filter(s -> s.contains("a")).toList();
    }

    // exercicio 3
    public static List<String> listStringSize(List<String> stringList) {
        return stringList.stream().filter(s -> s.length() > 3 && s.length() < 8).toList();
    }

    //exercicio 21
    public static List<String> stringDaLista(List<TString> tList) {
        return tList.stream().flatMap(s -> s.getStringList().stream()).toList();
    }
}
