package collections;

import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new java.util.LinkedList<>();
        //pode definir um tamanho maximo pra fila
        fila.add("Pedro");
        fila.add("Maria");// retorna erro caso tente add algo que nao cabe na fila
        fila.offer("Joaquim");
        fila.offer("maria");//joga para false caso tente add algo que nao cabe mais na fila
        System.out.println("Tamanho: " + fila.size());
        System.out.println("Conteudo: " + fila);
        System.out.println(fila.peek());//return false fila vazia
        System.out.println(fila.element());// exception na fila vazia
        System.out.println(fila.isEmpty());
        System.out.println(fila.poll());//retorna index0 já removendo ele, lista vazia retorna null
        System.out.println(fila.remove("maria"));//retorna index0 já removendo ele retorna exception na lista vazia
        fila.clear();
    }
}
