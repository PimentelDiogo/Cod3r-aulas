package poo;

public class Item {
    String nome;
    int quantidade;
    double valor;
    Compra compra;
    Item(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
