package array;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de notas: ");
        int qtdNotas = sc.nextInt();

        double[] notas = new double [qtdNotas];
        for(int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double total = 0.0;
        for(double nota:notas) {
            total +=nota;
        }
        double media = total /notas.length;
        System.out.println("Média: " + media);
        sc.close();
    }
}
