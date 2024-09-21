package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {

        double raio = 3.4;
        final double pi = 3.14;
        double area = Math.PI * Math.pow(raio, 2);
        double area2 = pi * raio * raio;
        System.out.println("Area = " + area);
        System.out.println("Area2 = " + area2);
    }
}
