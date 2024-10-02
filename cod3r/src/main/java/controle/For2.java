package controle;

public class For2 {
    public static void main(String[] args) {
        for(int contador = 10; contador >= 0; contador--) {
            System.out.println(contador);
        }
            int i = 0;
        for(; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("saiu do for");
        System.out.println(i);
        for(int j = 0; j < 10; j++) {
            for(int k = 0; k < 10; k++) {
                System.out.println(j + " " + k);
            }
        }

        for(String d ="#"; !d.equals("######") ; d += "#") {
            System.out.println(d);
        }
    }
}
