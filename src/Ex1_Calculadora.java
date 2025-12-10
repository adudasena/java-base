import java.util.Scanner;

public class Ex1_Calculadora {
    public static void main(String[] args) {

        //cria o scanner, pra ler as entradas
        Scanner sc = new Scanner(System.in);

        int operacao;

        //valores 1 e 2
        int valor1, valor2, resultado;

        //do while pra mostrar o menu ao menos 1 vez
        do {
        System.out.println("---CALCULADORA S2---");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("0- Sair");
        System.out.println("---");

        //lê a opção escolhida
            System.out.println("Escolha uma das opções:");
            operacao = sc.nextInt();

            //valida se for inválida
            if (operacao < 0 || operacao > 4) {
                System.out.println("Opção inválida! Tente novamente.");
                continue; //volta pro início do laço
            }

            //se for 0, sair do programa
            if (operacao == 0) {
                System.out.println("Saindo. ");
                break;
            }

            //se a opção não for sair, daí sim pega os valores
                System.out.print("Digite o valor 1: ");
                valor1 = sc.nextInt();

                System.out.print("Digite o valor 2: ");
                valor2 = sc.nextInt();

            //a operação
            switch (operacao) {
                case 1:
                    resultado = valor1 + valor2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    //validação de divisão por 0
                    if (valor2==0) {
                        System.out.println ("O valor não pode ser dividido por 0.");
                } else {
                        resultado = valor1 / valor2;
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
            }

            } while (true); //repete até o usuário escolher 0 e sair
    }
}