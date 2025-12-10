public class Ex6_Pares {
    //programa que soma todos os números pares de 0 a 100
    public static void main(String[] args) {

    int soma= 0;

        for (int i = 0; i <= 100; i++) {
           if (i % 2 ==0) {
               soma= soma + i;
               System.out.println (soma);
               continue;
           }
        }
    }
}
