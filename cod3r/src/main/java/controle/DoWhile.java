package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        System.out.println("Voce deseja sair: ");
        String valor = "";
        do {
            valor = sc.nextLine();
            System.out.println("Resposta: " + valor + "\nVoce deseja sair");
        } while (!valor.equalsIgnoreCase("sair"));
        sc.close();

        double total = 0.0;
        int qtdDeNotas = 0;
        double nota = 0.0;

        while (nota != -1) {
            System.out.println("Informe a nota ou -1 para sair: ");
            nota = sc2.nextDouble();
            if (nota <= 10 && nota >= 0) {
                total += nota;
                qtdDeNotas++;
            } else if (nota != -1) {
                System.out.println("nota invalida");
            }

        }
        double media = total / qtdDeNotas;
        System.out.println("Media: " + media);
        sc2.close();
    }
}

