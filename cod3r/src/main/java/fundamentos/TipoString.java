package fundamentos;

import java.util.Scanner;

public class TipoString {
    public static void main(String[] args) {

        String s = "Ola";
        String nome = "Pedro";
        String sobreNome = "Silva";
        String salario = "12345.67";
        String frase = String.format("%s %s %s", s, nome, sobreNome);
        System.out.println(frase);
        System.out.printf("%s %s %s", s, nome, sobreNome);
        System.out.println(s + " mundo");
        System.out.println("Ola".concat(" mundo"));
        System.out.println(s.equals("Ola"));
        System.out.println(s.equalsIgnoreCase("Ola"));
        System.out.println(s.contains("mundo"));
        System.out.println(s.contains("ola"));
        System.out.println(s.startsWith("Ola"));
        System.out.println(s.endsWith("Ola"));
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.isBlank());
        System.out.printf("Salario: %.1f%n", 12345.67);
        System.out.printf("Nome: %s%n", "Joao");

        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite seu nome: ");
        String entrada = sc.nextLine();
        System.out.println("\nNome = " + entrada);

        System.out.println("DIgite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("\nIdade = " + idade);
        sc.close();
    }
}
