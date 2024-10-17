package lambdas;

import java.util.function.Predicate;

public class PredicadoCOmpose {
    public static void main(String[] args) {
        Predicate<Integer> isPar = p -> p % 2 == 0;
        Predicate<Integer> isTresDigitos = p -> p >= 100 && p <= 999;
        System.out.println(isPar.and(isTresDigitos).test(123));
        System.out.println(isPar.or(isTresDigitos).test(124));
    }
}
