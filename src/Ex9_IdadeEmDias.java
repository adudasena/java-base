import java.util.Scanner;

public class Ex9_IdadeEmDias {

    public static void main(String[] args) {

        int dias= 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seus dias de vida: ");
        dias= sc.nextInt();

        int anos= (dias / 365);

        //atualizar a variável com o que sobrou
        dias= dias % 365;

        int meses= (dias  / 30);

        //atualizando com o que sobrou
        dias= dias % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }
}
