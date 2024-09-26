package controle;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int contador = 1;
//        while (contador <= 10) {
//            System.out.println(contador);
//            //contador++;
//            contador += 2;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Voce deseja sair: ");
        String valor = "";
        while (!valor.equalsIgnoreCase("sair")) {
            valor = sc.nextLine();
            System.out.println("Resposta: " + valor + "\nVoce deseja sair");
        }
        sc.close();
    }

}
