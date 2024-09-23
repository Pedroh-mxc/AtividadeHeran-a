package Heranca_02.entitites;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados(){
        System.out.println("A placa do veículo é " + placa + " e o ano de fabricação é " + ano + ", a quantidade de eixos é " + eixos);
    }
}
