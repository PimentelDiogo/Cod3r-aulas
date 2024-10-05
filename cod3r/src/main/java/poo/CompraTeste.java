package poo;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "João";
        c1.adicionaItem(new Item("TV", 1000.00, 1));
        c1.adicionaItem(new Item("Geladeira", 3000.00, 1));
        System.out.println(c1);
        c1.total();
        System.out.printf("Total: %.2f%n", c1.total());

        Compra c2 = new Compra();
        c2.cliente = "João";
        c2.adicionaItem(new Item("Geladeira", 3000.00, 1));
        c2.adicionaItem(new Item("Geladeira", 3000.00, 1));
        System.out.println(c2);
        c2.total();
        System.out.printf("Total: %.2f%n", c2.total());
    }
}
