import java.util.Scanner;
public class Ex8_Tabuada {
    //programa que gere a tabuada de um número fornecido pelo usuário
    //de 1 a 10
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número, para descobrir sua tabuada (de 1 a 10): ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
