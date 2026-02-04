public class Ex15_ManipulandoStrings {

    public static void main(String[] args) {
        //indexOf (índice de onde começa a palavra)
        String teste= "Esse é o teste inicial!";
        System.out.println(teste.indexOf("teste")); //retornou 9

        //trim (limpando espaços do usuário)
        String emailComEspaco = "  usuario@email.com  ";
        System.out.println(emailComEspaco.trim());

        //substring (extraindo pedaços)
        String frase = "Isso é um teste.";
        //a partir do 10 até o final
        System.out.println(frase.substring(10));
        //entre o 10 e o 15 (o 15 não entra)
        System.out.println(frase.substring(10, 15));

        //equals e equalsIgnoreCase (comparação de senhas)
        String senhaCadastrada = "Java123";
        String senhaDigitada = "java123";
        System.out.println(senhaCadastrada.equals(senhaDigitada)); // false
        System.out.println(senhaCadastrada.equalsIgnoreCase(senhaDigitada)); // true

        //startsWith e endsWith
        String testando = "<h1>";
        boolean comeca = testando.startsWith("<");
        boolean termina = testando.endsWith(">");
        System.out.println((comeca && termina));

        //isEmpty e isBlank (para as linhas vazias)
        String linhaEspacos = "   ";
        System.out.println(linhaEspacos.isEmpty()); // false (tem espaços)
        System.out.println(linhaEspacos.isBlank()); // true (não tem conteúdo real)
    }
}
