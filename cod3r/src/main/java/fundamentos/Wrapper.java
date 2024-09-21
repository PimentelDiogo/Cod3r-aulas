package fundamentos;

public class Wrapper {

    public static void main(String[] args) {
        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;
        Float f = 3.14F;
        Double d = 3.1415;
        Character c = 'c';
        Boolean bo = true;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);
        System.out.println(f * 3);
        System.out.println(d / 3);
        System.out.println(c);
        System.out.println(bo.toString().toUpperCase());
    }
}
