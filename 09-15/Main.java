import Entidades.*;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {


        //INICIO DO PROGRAMA

        JOptionPane.showMessageDialog(null,"                      SEJÁ BEM VINDO!","INÍCIO",
                JOptionPane.PLAIN_MESSAGE);

        String[] valores = {"VENDER", "VER LISTA DE VEÍCULOS"};

        String seletor = (String) JOptionPane.showInputDialog(null, "ESCOLHA", "MENU",
                JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);


        //OPÇÃO VENDER

        if (seletor.equals("VENDER")) {

            String[] modelos = {"Moto", "Carro"};

            String categoria = (String) JOptionPane.showInputDialog(null, "O VEÍCULO É?", "PREENCHA AS INFORMAÇÕES",
                    JOptionPane.QUESTION_MESSAGE, null, modelos, modelos[0]);


            //CARRO

            if (categoria.equalsIgnoreCase("CARRO")) {

                Carro c1 = new Carro(); c1.setCategoria(categoria);

                String modelo = JOptionPane.showInputDialog(null, "QUAL O MODELO DO CARRO?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE);
                c1.setModelo(modelo);

                String cor = JOptionPane.showInputDialog(null, "QUAL A COR?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE);
                c1.setCor(cor);

                String combustivel = JOptionPane.showInputDialog(null, "QUAL O COMBUSTÍVEL UTILIZADO?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE);
                c1.setCombustivel(combustivel);

                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "QUAL O VALOR?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE));
                c1.setValorTabela(valor); c1.calculaIpva();

                JOptionPane.showMessageDialog(null,c1.Status());

            }


            //MOTO

            else if (categoria.equalsIgnoreCase("MOTO")) {

                Moto m1 = new Moto(); m1.setCategoria(categoria);

                String modelo = JOptionPane.showInputDialog(null, "QUAL O MODELO DA MOTO?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE);
                m1.setModelo(modelo);

                String cor = JOptionPane.showInputDialog(null, "QUAL A COR?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE);
                m1.setCor(cor);

                String combustivel = JOptionPane.showInputDialog(null, "QUAL O COMBUSTÍVEL UTILIZADO?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE);
                m1.setCombustivel(combustivel);

                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "QUAL O VALOR?","PREENCHA AS INFORMAÇÕES",
                        JOptionPane.QUESTION_MESSAGE));
                m1.setValorTabela(valor); m1.calculaIpva();

                JOptionPane.showMessageDialog(null,m1.Status());

            }
        }


        //LISTA DE VEÍCULOS

        else if (seletor.equals("VER LISTA DE VEÍCULOS")) {

            Carro c1 = new Carro("Civic", "Preto", "Flex", "Carro", 51596, 0); c1.calculaIpva();
            Moto m1 = new Moto("Fazer 250", "Azul", "Gasolina", "Moto", 22000, 0); m1.calculaIpva();

            JOptionPane.showMessageDialog(null, c1.Status() +"\n\n"+ m1.Status(),"LISTA DE VEÍCULOS", JOptionPane.PLAIN_MESSAGE);

        }
    }
}
