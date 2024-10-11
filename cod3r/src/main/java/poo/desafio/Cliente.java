package poo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<Compra>();
    Cliente(String nome) {
        this.nome = nome;
    }
    double obterTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.total();
        }
        return total;
    }
    void adicionaCompra(Compra compra) {
        this.compras.add(compra);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCompras do cliente: ").append(nome).append("\nTotal:"+obterTotal());
        for (Compra compra : compras) {
            sb.append(compra.toString());
        }
        return sb.toString();
    }
}
