package poo;

public class Carro {
    Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }
    void acelerar(){
        motor.injecao += 0.4;
    }
    void frear(){
        motor.injecao -= 0.4;
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligar(){
        motor.ligado = false;
    }
    boolean estarLigado(){
        return motor.ligado;
    }
    @Override
    public String toString() {
        return "Carro [Ligado: " + motor.ligado + ", injeção: " + motor.injecao + ", giros: " + motor.giros() + "]";
    }
}
