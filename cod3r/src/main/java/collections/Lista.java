package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<User>();
        lista.add(new User("Pedro"));
        lista.add(new User("Maria"));
        lista.add(new User("Joaquim"));
        lista.add(new User("maria"));
        lista.add(new User("Pedro"));
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Conteudo: " + lista);
        lista.remove(2);
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Conteudo: " + lista.contains(new User("Pedro")));

        for(User u : lista) {
            System.out.println(u);
        }
    }
}
