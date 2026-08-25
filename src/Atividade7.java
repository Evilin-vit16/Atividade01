import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args){

        String nome = "";
        double distancia = 0;
        double litros = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome ? ");
        nome = sc.nextLine();

        System.out.println("Distância percorrida em quilômetros: ");
        distancia = sc.nextDouble();

        System.out.println("Quantidade de litros utilizados: ");
        litros = sc.nextDouble();

        double consumo = distancia / litros;

        System.out.println(nome + " o consumo é de aproximadamente " + consumo + "L");
    }
}
