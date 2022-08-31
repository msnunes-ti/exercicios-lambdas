package lambdas;

import java.util.List;

public class TInteger {

    private String nome;

    private List<Integer> integerList;

    public TInteger() {
    }

    public TInteger(String nome, List<Integer> integerList) {
        this.nome = nome;
        this.integerList = integerList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }
}
