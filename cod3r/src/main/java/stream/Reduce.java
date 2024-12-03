package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Bia", 6.1);
        Aluno a3 = new Aluno("Lia", 8.1);
        Aluno a4 = new Aluno("Gui", 10.0);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, Double> notas = a -> a.nota;
        BinaryOperator<Double> somatorio = (t, n) -> t + n;

        alunos.parallelStream()
                .filter(aprovados)
                .map(notas)
                .reduce(somatorio)
                .ifPresent(System.out::println);

        double media = alunos.stream().filter(aprovados).map(notas).reduce(somatorio).get()/ alunos.stream().filter(aprovados).count();
        
        System.out.println("Média: " + media);
    }
}
