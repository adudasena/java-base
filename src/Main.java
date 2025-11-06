import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        Character sexo;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        //validação se está preenchido
        if (nome.length() == 0) {
            System.out.println("Nome vazio, novamente por favor.");
        }

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        //validação de idade
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else
            System.out.println("Menor de idade");

        if (idade < 0 || idade > 120) {
            System.out.println("Idade inválida.");
        }

        System.out.println("Digite seu sexo: ");
        sexo = sc.next().charAt(0);

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos. Seu sexo é " + sexo);
    }
}