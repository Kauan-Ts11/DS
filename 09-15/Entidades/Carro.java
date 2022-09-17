package Entidades;

public class Carro extends Veiculo{


    //CONSTRUTOR VAZIO

    public Carro() {}


    //CONSTRUTOR HERDADO

    public Carro(String modelo, String cor, String combustivel, String categoria, double valorTabela, double ipva) {
        super(modelo, cor, combustivel, categoria, valorTabela, ipva);
    }


    //CALCULA IPVA

    @Override
    public void calculaIpva() { setIpva(super.ipva = super.valorTabela * 0.04);}

}
