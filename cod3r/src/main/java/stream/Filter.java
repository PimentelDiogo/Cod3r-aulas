package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Bia", 6.1);
    Aluno a3 = new Aluno("Lia", 8.1);
    Aluno a4 = new Aluno("Gui", 10.0);

    List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

    alunos.stream().filter(a -> a.nota >= 7).map(a -> a.nome).forEach(System.out::println);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno,String> saudacao = a -> "Parabéns " + a.nome + "!";
        alunos.stream().filter(aprovado).map(saudacao).forEach(System.out::println);
    }
}
