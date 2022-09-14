import Array.Array;
import Entidades.*;

import javax.swing.JOptionPane;

public class Main {

    private final static Array array = new Array();

    public static void main(String[] args) {


        //FILMES INSTANCIADOS

        array.adicionar(new Filme("Carros 2","Desenho","01:30"));
        array.adicionar(new Filme("Toy Story", "Desenho", "01:45"));
        array.adicionar(new Filme("Vingadores: Guerra Infinita","Ação","02:30"));
        array.adicionar(new Filme("Fuga das Galinhas", "Desenho", "01:10"));
        array.adicionar(new Filme("Monstros S.A","Desenho","01:58"));


        //SERIES INSTANCIADOS

        array.adicionar(new Serie("Teen Wolf", "Ficção", "Longa", 110, 6));
        array.adicionar(new Serie("Peaky Blinders", "Ação", "Curta", 32, 6));
        array.adicionar(new Serie("Naruto", "Anime", "Longa", 220, 9));
        array.adicionar(new Serie("Naruto Shippuden", "Anime", "Longa", 500, 9));
        array.adicionar(new Serie("Pokemon", "Anime", "Longa", 1000, 25));

        //INICIO DO PROGRAMA


        String[] valores = {"TODOS", "FILMES", "SERIES"};

        String seletor = (String) JOptionPane.showInputDialog(null, "ESCOLHA UMA CATEGORIA", "CATEGORIAS",
                JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

        if(seletor.equals("FILMES"))
            JOptionPane.showMessageDialog(
                    null, array.catalogo(new Filme()), "CATALOGO DE FILMES", JOptionPane.INFORMATION_MESSAGE);
        else if (seletor.equals("SERIES"))
            JOptionPane.showMessageDialog(
                    null, array.catalogo(new Serie()), "CATALOGO DE FILMES", JOptionPane.INFORMATION_MESSAGE);
        else if (seletor.equals("TODOS"))
            JOptionPane.showMessageDialog(
                    null, array.catalogo(), "CATALOGO DE FILMES", JOptionPane.INFORMATION_MESSAGE);
    }

}