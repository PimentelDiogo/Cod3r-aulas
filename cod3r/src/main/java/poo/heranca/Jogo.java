package poo.heranca;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        Heroi j2 = new Heroi();

        j2.x=10;
        j2.y=21;
        j1.x=10;
        j1.y=20;
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
