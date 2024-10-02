package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 4356.89;
        Produto.desconto = 0.15;

        var p2 = new Produto("");
        p2.nome = "Caneta";
        p2.preco = 12.56;

        double precoComDesconto1 = p1.precoComDesconto(0);
        double precoComDesconto2 = p2.precoComDesconto(0.1);
        double media = (precoComDesconto1+ precoComDesconto2) / 2.0;
        System.out.printf("media = R$%.2f.", + media);
    }
}
