package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    Produto( String nome){}
    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - (desconto + descontoDoGerente));
    }
}