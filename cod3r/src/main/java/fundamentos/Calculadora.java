package fundamentos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(0,0);
        calc.calculo();
    }
        double num1;
        double num2;
        public Calculadora( double num1, double num2){
            this.num1 = num1;
            this.num2 = num2;
        }
        public void calculo() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Calculadora\nInforme o primeiro valor: ");
            double num1 = sc.nextDouble();
            System.out.println("Informe o segundo valor: ");
            double num2 = sc.nextDouble();
            System.out.println("Selecione a operação: \n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Soma: " + num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println("Multiplicar: " + num1 * num2);
                    break;
                case 4:
                    System.out.println("Dividir: " + num1 / num2);
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
            sc.close();
        }
}
