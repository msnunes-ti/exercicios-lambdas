package lambdas;

import java.util.List;

public class ListaString {

    public static List<String> listStringToUpperCase(List<String> stringList) {
        return stringList.stream().map(String::toUpperCase).toList();
    }

    public static List<String> listStringContainsA (List<String> stringList) {
        return stringList.stream().filter(s -> s.contains("a")).toList();
    }

    public static List<String> listStringSize(List<String> stringList) {
        return stringList.stream().filter(s -> s.length() > 3 && s.length() < 8).toList();
    }

    //exercicio 21
    public static List<String> stringDaLista(List<TString> tList) {
        return tList.stream().flatMap(s -> s.getStringList().stream()).toList();
    }





}
