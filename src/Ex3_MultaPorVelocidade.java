public class Ex3_MultaPorVelocidade {
    //valor da multa é 10 reais para cada km acima da velocidade permitida
    //velocidade deve ser parametrizável
    //para uma velocidade até 100, a considerada é 7km a mais do que a do veículo
    //para acima de 100, é 10% a mais do que a velocidade do veículo
public static void main (String [] args) {

    int velocidadeVeiculo= 140;
    int velocidadePermitida= 110;
    int velocidadeConsiderada;

    if (velocidadeVeiculo < velocidadePermitida) {
        System.out.println("Não há multa.");
    }
    if (velocidadePermitida < 100) {
        velocidadeConsiderada= velocidadeVeiculo + 7;
    } else {
        velocidadeConsiderada= velocidadeVeiculo + (int) (velocidadeVeiculo * 0.1) ; //casting pois daria resultado double
    }

    int diferenca= velocidadeConsiderada - velocidadePermitida;
    int multa= diferenca * 10;
    System.out.println("Multa: " + multa);
}

}



