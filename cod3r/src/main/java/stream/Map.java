package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;


public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("Ford", "Fiat", "Volkswagen", "Honda");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n-> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n-> n.charAt(0) +"";
        UnaryOperator<String> grito = n-> n +"!!!";

        marcas.stream().map(maiuscula).forEach(print);//composição
        marcas.stream().map(maiuscula.andThen(primeiraLetra)).forEach(print);
        marcas.stream().map(maiuscula.andThen(primeiraLetra).andThen(grito)).forEach(print);
    }
}
