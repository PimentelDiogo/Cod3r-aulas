package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        //pode definir um tamanho maximo pra pilha
        Deque<String> livros = new ArrayDeque<>();
        livros.add("Biblia sagrada");//retorna null se add mais que o limite da pilha
        livros.push("O hobbit");//retorna exception se add mais que o limite da pilha
        livros.add("Don casmurro");

        System.out.println(livros.peek());
        System.out.println(livros.element());
        System.out.println(livros.poll());//retorna null na lista vazia
        System.out.println(livros.remove());//retorna exceptio na lista vazia
        System.out.println(livros.pop());//retorna exceptio na lista vazia

    }
}
