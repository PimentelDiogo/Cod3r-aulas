package poo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<Item>();

    void adicionaItem(Produto produto, int quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }
    void addItem(String nome, double preco, int quantidade) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quantidade));
    }
    double total() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nItens:\n");
        for (Item item : itens) {
            sb.append(item.toString());
        }
        return sb.toString();
    }
}
