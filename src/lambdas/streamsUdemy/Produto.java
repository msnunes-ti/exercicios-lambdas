package lambdas.streamsUdemy;

public class Produto {

    private String nome;
    private Double valor;
    private  double desconto;

    public Produto(String nome, Double valor, double desconto) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", desconto=" + desconto +
                '}';
    }
}
