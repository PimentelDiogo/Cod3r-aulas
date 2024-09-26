package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a media do aluno: ");
        double media = sc.nextDouble();
        if (media >= 7.0) {
            System.out.println("Aprovado");
        }
        if (media >= 5.0 && media < 7.0) {
            System.out.println("Recuperação");
        }
        if (media < 5.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Quadro de honra!");
        }
        sc.close();
    }
}
