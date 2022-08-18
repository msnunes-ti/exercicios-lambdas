package lambdas;

import java.util.List;

public class ListaString {

    public static List<String> listStringToUpperCase(List<String> stringList) {
        return stringList.stream().map(String::toUpperCase).toList();
    }

    public static List<String> listStringContainsA (List<String> stringList) {
        return stringList.stream().filter(s -> s.contains("a")).toList();
    }



}
