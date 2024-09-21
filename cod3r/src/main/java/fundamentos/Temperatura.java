package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double FATOR = 5.0/9.0;
        final double AJUSTE = 32.0;
        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);

    }
}
