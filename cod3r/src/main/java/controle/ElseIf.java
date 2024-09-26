package controle;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a media do aluno: ");
        double media = sc.nextDouble();
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Recuperação");
        } else if (media < 5.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Quadro de honra!");
        }
        sc.close();
    }
}
