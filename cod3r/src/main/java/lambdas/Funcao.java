package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(5));
        Function<String,String> resultado = valor ->"Resultado é "+valor;

        String resultadoFinal = parOuImpar.andThen(resultado).apply(5);//andThen concatena dois metodos function
        System.out.println(resultadoFinal);
    }
}
