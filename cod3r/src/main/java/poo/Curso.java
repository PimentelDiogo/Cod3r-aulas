package poo;

import java.util.ArrayList;

public class Curso {
    String nome;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    Curso(String nome) {
        this.nome = nome;
    }
    public void adicionaAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
