package fundamentos;

public class Atribuicao {

    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = b + a;
        int d = 1;

        System.out.println(c);
        c += b;
        System.out.println(c);
        c -= a;
        System.out.println(c);
        c *= b;
        System.out.println(c);
        c /= a;
        System.out.println(c);
        c %= 2;
        System.out.println(c);

        //unario
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);
        //pre fixado
        System.out.println(++d);
        System.out.println(--c);
        //pos fixado
        System.out.println(c++);
        System.out.println(c--);
        System.out.println(++d == b--);

    }
}
