package poo.encapsulamento;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
    }
    public int lerIdade(){
        return idade;
    }
    public void alterarIdade(int novaIdade){
        if(novaIdade >= 0){
        this.idade = novaIdade;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
