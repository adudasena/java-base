public class Ex5_IfTernario {
    public static void main(String[] args) {
        int idade = 10;

//        String texto;

        //       if (idade >= 18) {
//            texto = "Maior de idade ";
        //       } else {
        //          texto = "Menor de idade ";

        //ternário
        String texto = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(texto);
    }
}

//variável recebe a condição, usa interrogação, e após a interrogação,
//a condição verdadeira e a falsa. Apenas 2 são possíveis.

