package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calculo = (x, y) -> x + y;
        System.out.print(calculo.Executar(2, 5));
    }
}
