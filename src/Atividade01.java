import java.util.Scanner;

public class Atividade01 {

   public static void main(String[] args){

       // Scanner é uum obejeto
       // sc é o nome do objeto
       // new instancia (cria) um objeto
       // new Scanner indica o tipo do objeto criado
       // (System.in) é um parametro

       //Inicialização de variaveis
       String nome = "";
       String curso = "";
        int periodo = 0;
        int idade =  0;

       Scanner sc = new Scanner(System.in);
       System.out.println("Qual seu nome ? ");
       nome = sc.nextLine();

       System.out.println("Qual é o seu curso ? ");
       curso = sc.nextLine();

       System.out.println("Qual o seu periodo ? ");
       periodo = sc.nextInt();

       System.out.println("Quantos anos tem ? ");
       idade = sc.nextInt();

       System.out.println("O nome e: " +nome);
       System.out.println("O curso e: " +curso);
       System.out.println("O periodo e: " +periodo);
       System.out.println("Idade " +idade+ " anos");

   }
}
