import java.util.Scanner;

public class Ex4_DiaSemana {
 public static void main (String [] args) {
     Scanner dia = new Scanner(System.in);

     int diaSemana;

     do {
         System.out.print("Digite um dia da semana (de 1 a 7) e 0 para sair: ");
         diaSemana = dia.nextInt();

         switch (diaSemana) {
             case 0:
                 System.out.println("Saindo...");
                 break;
             case 1:
                 System.out.println("Domingo");
                 break;
             case 2:
                 System.out.println("Segunda");
                 break;
             case 3:
                 System.out.println("Terça");
                 break;
             case 4:
                 System.out.println("Quarta");
                 break;
             case 5:
                 System.out.println("Quinta");
                 break;
             case 6:
                 System.out.println("Sexta");
                 break;
             case 7:
                 System.out.println("Sábado");
                 break;
             default:
                 System.out.println("Inválido. Escolha de 1 a 7.");
         }

     } while (diaSemana!=0);
     dia.close(); //boa prática, fechar scanner
 }
}
