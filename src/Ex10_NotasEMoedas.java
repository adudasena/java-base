import java.util.Scanner;
import java.util.Locale;

public class Ex10_NotasEMoedas {
    //Leia um valor de ponto flutuante com duas casas decimais.
    // Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
    // As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
    // A seguir mostre a relação de notas necessárias.
    public static void main(String[] args) {
        //Locale de US garante que o sistema use . ao invés de exigir ,

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double valor = sc.nextDouble();

        //convertemos o valor para centavos inteiros, multiplicando por 100
        //pois, 67.01 vira 67.00999999998 por exemplo
        //o resultado estava saindo quebrado (0.6023nota(s) de R$ 100.00) ao invés de notas inteiras
        //e com os centavos inteiros, multiplicando por 100 reais vira unidades inteiras
        long centavos= Math.round(valor*100);

        //notas
        long nota100= centavos/10000;
        long nota50= (centavos % 10000) /5000;
        long nota20= (centavos % 5000) /2000;
        long nota10= (centavos % 2000)/1000;
        long nota5= (centavos % 1000)/500;
        long nota2= (centavos % 500)/200;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        //moedas
        long moeda1= (centavos % 200)/100;
        long moeda50= (centavos % 100)/50;
        long moeda25= (centavos % 50)/25;
        long moeda10= (centavos % 25)/10;
        long moeda5= (centavos % 10)/5;
        long moeda01= (centavos % 5);

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");

    }
}

