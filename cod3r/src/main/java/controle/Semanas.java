package controle;

import java.util.Scanner;

public class Semanas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o dia da semana: ");
        String dia = sc.next();
        if(dia.equalsIgnoreCase("domingo")) {
            System.out.println("1");
    } if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");
    } if (dia.equalsIgnoreCase("terça") || "terca".equalsIgnoreCase(dia)){
            System.out.println("3");
    } if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("4");
    } if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("5");
    } if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("6");
    } if (dia.equalsIgnoreCase("sabado") || "sabado".equalsIgnoreCase(dia)) {
            System.out.println("7");
    }
        sc.close();
    }
}
