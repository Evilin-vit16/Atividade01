import java.util.Scanner;

public class ATIVIDADE3 {
    public static void main(String[] args){

        String nome = "";
        double primeiroValor = 0;
        double segundoValor = 0;
        double terceiroValor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome ? ");
        nome = sc.nextLine();

        System.out.println("Informe o primeira nota: ");
        primeiroValor = sc.nextDouble();

        System.out.println("Informe a segunda nota");
        segundoValor = sc.nextDouble();

        System.out.println("Informe a segunda nota");
        terceiroValor = sc.nextDouble();

        double media = (primeiroValor + segundoValor + terceiroValor)/3;

        System.out.println(nome + "A média é : " +media);

    }
}
