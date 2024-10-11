package poo.desafio;

public class Sistema {
    public static void main(String[] args) {

    Cliente cliente = new Cliente("João");

    Compra compra = new Compra();
    compra.addItem("TV", 1000.00, 1);
    compra.adicionaItem(new Produto("Geladeira", 3000.00),1);

    Compra compra2 = new Compra();
    compra2.addItem("Caderno", 10.00, 1);
    compra2.adicionaItem(new Produto("Cadeira", 300.00),1);

    cliente.adicionaCompra(compra); //metodo encapsulado
    cliente.compras.add(compra2); // direto na main
    System.out.println(cliente);
    }
}
