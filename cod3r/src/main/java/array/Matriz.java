package array;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int qtdAlunos = sc.nextInt();
        System.out.println("Quantidade de notas dos alunos: ");
        int qtdNotas = sc.nextInt();

        double [] [] notasTurma = new double [qtdAlunos][qtdNotas];
        double total=0;
        for(int i = 0; i <notasTurma.length; i++) {
            for(int j = 0; j <notasTurma[i].length; j++) {
                System.out.print("Digite a nota do aluno " + (i+1) + " na prova " + (j+1) + ": ");
                notasTurma[i][j] = sc.nextDouble();
                total += notasTurma[i][j];
            }
        }
        double media =total / (qtdAlunos * qtdNotas);
        System.out.println(media);
        for(double[] notasDoAluno: notasTurma)
        System.out.println(Arrays.toString(notasDoAluno));
        sc.close();
    }
}
