package classe;

public class AreaTeste {
    public static void main(String[] args) {

        Area a1 = new Area( 10);
        System.out.println(a1.area());

        Area a2 = new Area( 5);
        a2.raio = 2;//mudando raioInicial
        System.out.println(a2.area());
    }
}
