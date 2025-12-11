public class Main {
    public static void main(String[] args) {
    Fraction fraction1= new Fraction();
    fraction1.set(2,4);
    fraction1.show();

    Fraction fraction2= new Fraction();
    fraction2.set(3,6);
    fraction2.show();

    Fraction fraction3= fraction1.multiply(fraction2);
    fraction3.show();
    }
}