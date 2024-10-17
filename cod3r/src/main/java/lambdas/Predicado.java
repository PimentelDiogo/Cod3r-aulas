package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = p -> p.preco > 2500.0;
        System.out.println(isCaro.test(new Produto("Notebook", 3000.0, 0.25)));
    }
}
