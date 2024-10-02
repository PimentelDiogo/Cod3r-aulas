package classe;

public class Area {
    double raio;
    final static double PI = 3.14; //por convenção o que é final fica maiusculo

    Area(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        return PI * raio * raio;
    //return Math.PI * Math.pow(raio, 2);
    }
}
