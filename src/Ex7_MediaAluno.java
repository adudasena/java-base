import java.util.Scanner;
public class Ex7_MediaAluno {
    //programa que calcula a media, notas são fornecidas pelo usuário
    //usuário pode fornecer quantas desejar
    //quando o enter for pressionado sem nota, o programa calcula e encerra
    public static void main(String[] args) {

        int quantidadeNotas= 1;
        double somaNotas= 0.0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite suas notas: ");
            String linha = scanner.nextLine();

            if (linha.equals("")) {
                quantidadeNotas--;
                break;
            }

            somaNotas = somaNotas + Double.parseDouble(linha);
            quantidadeNotas++;
        }
            double media = somaNotas / quantidadeNotas;
            System.out.println("Media: " + media);
        }
    }
