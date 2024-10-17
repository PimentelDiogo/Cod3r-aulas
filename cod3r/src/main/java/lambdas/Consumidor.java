package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("Notebook", 3000.0, 0.25);
        Produto p2 = new Produto("Cadeira", 1000.0, 0.15);
        imprimir.accept(p2);

        List<Produto> produtos = Arrays.asList(p1,p2);
        produtos.forEach(imprimir);
        produtos.forEach(p-> System.out.println(p.preco)); //lambda
        produtos.forEach(System.out::println);//method reference

    }
}
