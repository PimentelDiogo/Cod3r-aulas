package classe;

public class Equals {
    public static void main(String[] args) {
        User u1 = new User();
        u1.nome = "Pedro";
        u1.email = "p@.com";

        User u2 = new User();
        u2.nome = "Pedro";
        u2.email = "p@.com";
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

    }
}
