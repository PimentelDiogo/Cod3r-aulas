package stream;

public class Produto {
    String nome;
    double preco;
    double desconto;
    double frete;

    public Produto(String nome, double preco, double desconto, double frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                ", frete=" + frete +
                '}';
    }
}
