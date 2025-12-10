public class Ex2_ValoresDeX {
    public static void main(String[] args) {

        //atv: programa que o valor não é escolhido pelo usuário. Se x for par recebe
        //ele somado com 5, se for ímpar recebe ele multiplicado por 2
        //usando if-else

        int x = 17;

        if (x % 2 == 0) {
            x = x + 5;
            System.out.println("Par: " + x);
        } else {
            x = x * 2;
            System.out.println("Ímpar: " + x);
        }
    }
}
