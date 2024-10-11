package poo;

import java.util.ArrayList;

public class Aluno {
    String nome;
    ArrayList<Curso> cursos = new ArrayList<Curso>();

    Aluno(String nome) {
        this.nome = nome;
    }
    public void adicionaCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    @Override
    public String toString() {
        return nome;
    } // exibe apenas o nome do aluno ao invés do identificador de memória
}
