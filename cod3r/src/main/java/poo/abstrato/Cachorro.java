package poo.abstrato;

public class Cachorro extends Mamifero {

    @Override
    public String respirar() {
        return "Respirando";
    }

    @Override
    public String mamar() {
        return "Mamando";
    }
}
