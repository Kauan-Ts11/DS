package Array;

import Entidades.Conteudo;

import java.util.ArrayList;

public class Array {


    //DECLARAÇÃO E INICIALIZAÇÃO DO ARRAY

    private ArrayList<Conteudo> listaConteudo = new ArrayList<>();


    //ADICIONAR OBJETOS NA LISTA

    public void adicionar(Conteudo c) {

        this.listaConteudo.add(c);

    }


    //MOSTRAR INFORMAÇÕES DO ARRAY --TODAS AS CATEGORIAS--

    public String catalogo() {

        String catalogo ="";

        for (Conteudo c : this.listaConteudo) {

            catalogo += c.Descricao()+"\n-------------------------------------------------------\n";

        }

        return catalogo;
    }


    //MOSTRAR INFORMAÇÕES DO ARRAY --FILME OU SERIE--

    public String catalogo(Conteudo tipo) {

        String catalogo ="";

        for (Conteudo c : this.listaConteudo) {
            if(c.getClass() == tipo.getClass())

                catalogo += c.Descricao()+"\n-------------------------------------------------------\n";

        }

        return catalogo;
    }

}
