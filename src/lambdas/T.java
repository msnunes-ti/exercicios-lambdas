package lambdas;

import java.util.List;

public class T {

    private String nome;

    private List<String> stringList;

    public T(String nome, List<String> stringList) {
        this.nome = nome;
        this.stringList = stringList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
