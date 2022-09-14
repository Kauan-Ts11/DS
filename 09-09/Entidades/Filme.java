package Entidades;

public class Filme extends Conteudo{


    //CONSTRUTOR VAZIO

    public Filme(){}


    //CONSTRUTOR PARA AS FILHAS HERDAREM

    public Filme(String titulo, String categoria, String duracao) {
        super(titulo, categoria, duracao);
    }


    //DESCRIÇÃO

    @Override
    public String Descricao() {

        return
                "TITULO: "+super.getTitulo()+"\n"+
                "CATEGORIA: "+super.getCategoria()+"\n"+
                "DURAÇÃO: "+super.getDuracao()+"\n";

    }

}
