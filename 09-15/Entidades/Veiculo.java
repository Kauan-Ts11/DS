package Entidades;

// @Lombok
// @Getter
// @Setter

public abstract class Veiculo {


    //CONSTRUTOR VAZIO

    public Veiculo() {}


    //CONSTRUTOR

    public Veiculo(String modelo, String cor, String combustivel, String categoria, double valorTabela, double ipva) {
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.categoria = categoria;
        this.valorTabela = valorTabela;
        this.ipva = ipva;
    }


    //ATRIBUTOS

    private String modelo,  cor, combustivel, categoria;
    protected double valorTabela, ipva;


    //MÉTODO ABSTRATO --CALCULA IPVA--

    public abstract void calculaIpva();


    //STATUS

    public String Status() {

       return
                "---------------------------------\nCategoria: "+this.getCategoria()+"\n"+
                "Modelo: "+this.getModelo()+"\n"+
                "Cor: "+this.getCor()+"\n"+
                "Combustível: "+this.getCombustivel()+"\n"+
                "IPVA: R$"+this.getIpva()+"\n"+
                "Valor de Tabela: R$"+this.getvalorTabela();
    }

    //MÉTODOS GETTERS

    public String getModelo() {
        return modelo;
    }

    public double getvalorTabela() {
        return valorTabela;
    }

    public String getCor() {
        return cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getIpva() {
        return ipva;
    }

    public String getCategoria() {
        return categoria;
    }


    //MÉTODOS SETTERS

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorTabela(double valorTabela) {
        this.valorTabela = valorTabela;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setIpva(double ipva) {
        this.ipva = ipva;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
