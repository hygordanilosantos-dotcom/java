public class matheus {
    public static void main(String[] args) {
        double nota = 8.5;
        double nota2 = 4.0;

        double media = (nota + nota2)/2;
        System.out.println("media das nota " + media);

        boolean passou = media >= 7.0;
        boolean  presencamedia = true;

        boolean aprovadoFinal = passou && presencamedia;
        System.out.println("O aluno foi aprovado? " + aprovadoFinal);

    }
}
