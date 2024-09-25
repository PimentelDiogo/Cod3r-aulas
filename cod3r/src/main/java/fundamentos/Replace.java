package fundamentos;

import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        String s = sc.next().replace(",", ".");
        System.out.println("O valor digitado foi: " + s);
        sc.close();
    }
}
