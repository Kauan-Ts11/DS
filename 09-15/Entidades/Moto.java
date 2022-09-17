package Entidades;

public class Moto extends Veiculo{


    //CONSTRUTOR VAZIO

    public Moto() {}


    //CONSTRUTOR HERDADO

    public Moto(String modelo, String cor, String combustivel, String categoria, double valorTabela, double ipva) {
        super(modelo, cor, combustivel, categoria, valorTabela, ipva);
    }


    //CALCULA IPVA

    @Override
    public void calculaIpva() { setIpva(super.ipva = super.valorTabela * 0.02);}
}
