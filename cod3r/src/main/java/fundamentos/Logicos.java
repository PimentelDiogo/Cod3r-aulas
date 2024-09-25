package fundamentos;

public class Logicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = !b2;

        boolean b4 = b1 && b2;
        boolean b5 = b1 && b3;
        boolean b6 = b1 || b2;
        boolean b7 = b1 || !b3;
        boolean b8 = b1 ^ b2;
        boolean b9 = b1 && !!b2;

        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);
        System.out.println(b9);

        boolean trab1 = true;
        boolean trab2 = true;

        boolean compTV50 = trab1 && trab2;
        boolean compTV35 = trab1 ^ trab2;
        boolean compSorvete = trab1 || trab2;
        System.out.println("comprou tv 50\"?" + compTV50);
        System.out.println("comprou tv 35\"?" + compTV35);
        System.out.println("comprou sorvete?" + compSorvete);
        System.out.println("Mais saudavel?" + !compSorvete);
    }
}
