package poo.heranca;

public class Jogador {
    int vida = 100;
    int x;
    int y;

    Jogador(int x,int y){
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente){

        int deltaX = Math.abs(x- oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY ==1){
            oponente.vida -=10;
        }else if(deltaX ==1 && deltaY ==0){
            oponente.vida -=10;
        }
        return true;
    }

    boolean andar(Direcao direcao){
        if(direcao == Direcao.NORTE){
             y++;
        }
        if(direcao == Direcao.SUL){
             y--;
        }
        if(direcao == Direcao.LESTE){
             x++;
        }
        if(direcao == Direcao.OESTE){
             x--;
        }
        return true;
    }
}
