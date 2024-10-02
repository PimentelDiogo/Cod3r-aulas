package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data( 01, 01, 1970);
        d1.dia = 10;
        d1.mes = 5;
        d1.ano = 2021;
        System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d1.obterDataFormatada());
    }
}
