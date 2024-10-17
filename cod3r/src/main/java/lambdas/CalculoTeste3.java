package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calculo = (x, y) -> x + y;
        System.out.print(calculo.apply(2.0, 5.0));
    }
}
