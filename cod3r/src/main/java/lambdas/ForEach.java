package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        aprovados.forEach(nome -> System.out.println(nome + "!!"));//usando lambda
        aprovados.forEach(nome-> imprimeAprovados(nome));//usando lambda

        aprovados.forEach(System.out::println); //usando method reference
        aprovados.forEach(ForEach::imprimeAprovados); //usando method reference

    }
    static void imprimeAprovados(String nome){
        System.out.println("Nome: " + nome);
    }
}
