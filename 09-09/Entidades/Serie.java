package Entidades;

public class Serie extends Conteudo{



    //ATRIBUTOS

    private int qntdEps, qntdTemps;


    //CONSTRUTOR VAZIO
    public Serie() {}


    //CONSTRUTOR PARA AS FILHAS HERDAREM

    public Serie(String titulo, String categoria, String duracao, int qntdEps, int qntdTemps) {
        super(titulo, categoria, duracao);
        this.qntdEps = qntdEps;
        this.qntdTemps = qntdTemps;
    }


    //DESCRIÇÃO

    @Override
    public String Descricao() {

        return
                "TITULO: "+super.getTitulo()+"\n"+
                        "CATEGORIA: "+super.getCategoria()+"\n"+
                        "DURAÇÃO: "+super.getDuracao()+"\n"+
                        "QUANTIDADE DE EPISODIOS: "+this.getQntdEps()+"\n"+
                        "QUANTIDADE DE TEMPORADAS: "+this.getQntdTemps()+"\n";
    }


    //MÉTODOS GETTERS

    public int getQntdEps() {
        return qntdEps;
    }

    public int getQntdTemps() {
        return qntdTemps;
    }


    //MÉTODOS SETTERS

    public void setQntdEps(int qntdEps) {
        this.qntdEps = qntdEps;
    }

    public void setQntdTemps(int qntdTemps) {
        this.qntdTemps = qntdTemps;
    }

}
