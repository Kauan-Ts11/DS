package Entidades;

public abstract class Conteudo {


    //ATRIBUTOS

    public String  titulo, categoria, duracao;


    //CONSTRUTOR VAZIO

    public Conteudo(){}


    //CONSTRUTOR PARA AS FILHAS HERDAREM

    public Conteudo(String titulo, String categoria, String duracao) {
        super();
        this.titulo = titulo;
        this.categoria = categoria;
        this.duracao = duracao;
    }


    //DESCRIÇÃO

    public abstract String Descricao();


    //MÉTODOS GETTERS

    public String getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }


    //MÉTODOS SETTERS

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

}
