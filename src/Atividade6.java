import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args){

        String nome = "";
        double comprimento = 0;
        double largura = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome ? ");
        nome = sc.nextLine();

        System.out.println("Informe comprimento em metros: ");
        comprimento = sc.nextDouble();

        System.out.println("Informe a largura em metros: ");
        largura = sc.nextDouble();

        double area = comprimento * largura;

        System.out.println(nome + " a area é de aproximadamente " + area + "m");
    }

}
