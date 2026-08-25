import java.util.Scanner;

public class Atividade5 {

        public static void main(String[] args){

            String nome = "";
            double horasTrabalhadas = 0;
            double valorRecebido = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual seu nome ? ");
            nome = sc.nextLine();

            System.out.println("Informe a quantidade de horas trabalhadas: ");
            horasTrabalhadas = sc.nextDouble();

            System.out.println("Informe o valor recebido por hora: ");
            valorRecebido = sc.nextDouble();

            double total = horasTrabalhadas * valorRecebido;

            System.out.println(nome + " seu sálario é " + total + " R$");
        }

}
