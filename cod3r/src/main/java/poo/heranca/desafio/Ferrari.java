package poo.heranca.desafio;

public class Ferrari extends Carro{
    @Override
    void acelerar(Acao acao) {
        velocidadeAtual+=15;
        super.acelerar(acao);// essa ação vale os 5km herdado da aceleracao de carro, ele sobreescreve os 15 e add os 5km iniciais de carro
    }

    @Override
    void frear(Acao acao) {
        super.frear(acao);
    }
}
