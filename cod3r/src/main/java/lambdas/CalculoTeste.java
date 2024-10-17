package lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
         Calculo soma = (x,y)->{
           return x+y;
         };
         System.out.print(soma.Executar(2,5));
    }
}
