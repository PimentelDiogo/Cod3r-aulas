package poo.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro fiat = new Marca();
        Ferrari ferrari = new Ferrari();
        fiat.acelerar(Acao.ACELERAR);
        ferrari.acelerar(Acao.ACELERAR);
        System.out.println(fiat);
        System.out.println(ferrari);

    }
}
