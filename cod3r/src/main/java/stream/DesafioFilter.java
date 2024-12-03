package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3000.0, 0.25,0);
        Produto p2 = new Produto("Cadeira", 1000.0, 0.15,30);
        Produto p3 = new Produto("Mesa", 2000.0, 0.50,0);
        Produto p4 = new Produto("Teclado", 150.0, 0.50,30);
        Produto p5 = new Produto("Mouse", 20.0, 0.50,30);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produto> promocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.frete == 0;
        Predicate<Produto> relevante = p -> p.preco >=500;

        produtos.stream()
                .filter(promocao)
                .filter(freteGratis)
                .filter(relevante)
                .forEach(System.out::println);
    }
}
