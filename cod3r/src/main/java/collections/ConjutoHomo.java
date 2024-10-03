package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjutoHomo {
    public static void main(String[] args) {
       // Set<String> lista = new HashSet<String>();
        SortedSet<String> lista = new TreeSet<String>();  //Garante a ordem de inserção


        lista.add("Pedro");
        lista.add("Maria");
        lista.add("Joaquim");
        lista.add("maria");

        System.out.println("Tamanho: " + lista.size());
        System.out.println("Conteudo: " + lista);

        lista.remove("Maria");
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Conteudo: " + lista);
    }
}
