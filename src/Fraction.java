public class Fraction {
    /* A classe deve ser capaz de armazenar o numerador e denominador
    da fração, ela ainda deve ter métodos que recebem função como parâmentro,
    multiplicando ambas as frações e retornam uma nova como resultado.
    Deve instanciar duas frações, definir valores, calcular o valor da multiplicação
    entre elas e mostrar o resultado.
     */

    int numerator;
    int denominator;

    void set(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void show() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    Fraction multiply(Fraction fractionInicial) { //recebe a segunda
        Fraction fractionResultante = new Fraction(); //cria a nova

        //multiplica numeradores (o primeiro com o da segunda)
        fractionResultante.numerator = numerator * fractionInicial.numerator;
        //agora com os denominadores, o primeiro e segundo
        fractionResultante.denominator = denominator * fractionInicial.denominator;

        //retorna o novo objeto Fraction, com o resultado
        return fractionResultante;

    }

}