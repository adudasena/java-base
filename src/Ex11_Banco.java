public class Ex11_Banco {
    private double saldo;

    //setter que define o valor
    public void setSaldo(double saldo) {
        //this.saldo é o private
        //saldo sozinho é o parâmetro
        if (saldo > 0) {
            this.saldo = saldo * 2;
        } else
            System.out.println("Valor inválido");
    }

    public double getSaldo() {
        return saldo;
    }
}