package poo.desafio;

public class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return String.format(" %s, %.2f", this.nome, this.preco);
    }
}
