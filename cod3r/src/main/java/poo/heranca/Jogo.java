package poo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador(10,21);
        Heroi j2 = new Heroi(10,20);

        j1.andar(Direcao.NORTE);
        j2.andar(Direcao.OESTE);

        System.out.println("Jogador tem"+j1.vida);
        System.out.println("Heroi tem"+j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println("Jogador tem"+j1.vida);
        System.out.println("Heroi tem"+j2.vida);

    }
}
