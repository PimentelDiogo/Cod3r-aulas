package poo;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");

        Curso c1 = new Curso("Java");
        Curso c2 = new Curso("Flutter");

        c1.adicionaAluno(a1);
        c1.adicionaAluno(a2);

        a3.adicionaCurso(c1);
        a3.adicionaCurso(c2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(a1.cursos.get(0).alunos);
    }
}
