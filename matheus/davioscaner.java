import java.util.Scanner;

public class davioscaner{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        hygor meuCarro = new hygor();

        System.out.println("===Cadastro de veiculo");
        System.out.println("digite o modelo do carro");
        meuCarro.modelo = teclado.nextLine();

        System.out.println("digite a cor do carro");
        meuCarro.cor = teclado.nextLine();

        System.out.println("digite o numero do carro");
        meuCarro.ano = teclado.nextInt(); 

        System.out.println("\n-----Carro cadastrado com sucesso");
        System.out.println("modelo" + meuCarro.modelo);
        System.out.println("cor:" + meuCarro.cor);
        System.out.println("ano" + meuCarro.ano);


    }
}