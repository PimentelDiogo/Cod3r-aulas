package poo;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionaItem(Item item) {
        this.itens.add(item);
        item.compra = this; //this é a referencia de compra em item!
    }
    double total() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.valor;
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCompra do cliente: ").append(cliente).append("\n");
        sb.append("Itens:\n");
        for (Item item : itens) {
            sb.append(item.toString());
        }
        return sb.toString();
    }
}
