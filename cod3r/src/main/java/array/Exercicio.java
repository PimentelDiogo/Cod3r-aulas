package array;

public class Exercicio {
    public static void main(String[] args) {

        double[] notas = new double[4];
        notas[0] = 7.8;
        notas[1] = 9.3;
        notas[2] = 5.7;
        notas[3] = 8.1;
        double total = 0.0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        double media = total / notas.length;
        System.out.println("Média: " + media);

        double[] notasAluno = {7.8, 9.3, 5.7, 8.1};
        double total2 = 0.0;
        for (int i = 0; i <notasAluno.length; i++) {
            total2 +=notasAluno[i];
        }
        double media2 = total2 /notasAluno.length;
        System.out.println("Média: " + media2);
    }
}
