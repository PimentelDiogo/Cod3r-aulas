package lambdas;

public class Produto extends Object {
    String nome;
    double preco;
    double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    public String toString() {
        return "Nome: " + nome + ", Preço: " + preco + ", Desconto: " + desconto;

    }
}
