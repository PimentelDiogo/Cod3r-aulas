package poo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
   Produto produto;
   int quantidade;


   Item(Produto produto, int quantidade) {
       this.produto = produto;
       this.quantidade = quantidade;
   }

    @Override
    public String toString() {
        return String.format(" %s, quantidade: %d", this.produto, this.quantidade);
    }
}
