package poo;

public class Motor {
    double injecao = 1;
    boolean ligado = false;

    public Motor(Carro carro) {
    }

    int giros(){
        if(!ligado){
            return  0;
        } else{
            return (int) Math.round(injecao * 3000);
        }
    }

}
