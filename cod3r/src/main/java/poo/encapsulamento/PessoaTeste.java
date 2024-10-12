package poo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Pedro");
        p1.setIdade(20);
        System.out.println("Nome: "+ p1.getNome());
        System.out.println("Idade: "+ p1.getIdade());

        p2.setNome("Maria");
        p2.lerIdade();
        System.out.println("Idade: "+ p2.getIdade());
        p2.alterarIdade(25);
        System.out.println("Idade: "+ p2.getIdade());
    }
}
