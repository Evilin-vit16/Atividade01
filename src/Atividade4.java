import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args){

    String nome = "";
    int anoNascimento =  0;
    int ano = 2026;
    Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome ? ");
        nome = sc.nextLine();

        System.out.println("Informe o ano do seu nascimento: ");
        anoNascimento = sc.nextInt();

        int idade = ano - anoNascimento;

        System.out.println(nome + " possui aproximadamente " +idade + " anos");
    }
}

