package poo.heranca.desafio;

public class Carro {
    int velocidadeAtual;

    void acelerar(Acao acao){
        if(acao == Acao.ACELERAR) {
            velocidadeAtual += 5;
        }
    }
    void frear(Acao acao){
       if (acao == Acao.FREAR && velocidadeAtual>=5){
           velocidadeAtual-=5;
       }else{
           velocidadeAtual = 0;
       }
    }
    public String toString(){
        return "Velocidade atual "+velocidadeAtual+" KM/h";
    }
}
