package Interfaz;

import Clases.Arbol;
import Clases.NodosHoja;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EtapasPartido extends JFrame {
    private JButton EMPEZARButton;
    private JComboBox comboBox1;
    private JPanel panelPartidos;
    private JLabel txtTitulo;
    private JTextArea textArea1;
    private JButton preordenButton;

    public EtapasPartido(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelPartidos);
        this.pack();
        //panelMostrar.setVisible(false);
        EMPEZARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Tamaño del arreglo que me pasan: "+ NodosHoja.getInstancia().getListaNodosHoja().size());
                int controlTama=NodosHoja.getInstancia().getListaNodosHoja().size();

                int contadorFases=0;//nivel en donde estamos
                int fases=0;//Cambio d enivel
                while(controlTama!=1){//controla la altura
                    //cargarComboBoxPARTIDOS();
                    fases=controlTama/2;
                    contadorFases++;
                    txtTitulo.setText("PARTIDOS FASE "+contadorFases);

                    int contadorPartidos=0;
                    while(NodosHoja.getInstancia().getListaNodosHoja().size()>  fases){//controla el emparejamiento
                        contadorPartidos++;
                        Arbol.setResultadoFinal("Fase torneo: "+contadorFases+"\n");
                        AsignarEquipos1 ig=new AsignarEquipos1(contadorPartidos,contadorFases);
                        ig.setVisible(true);
                        System.out.println("Tamaño de la lista dentro del while"+NodosHoja.getInstancia().getListaNodosHoja().size());

                    }
                    controlTama=NodosHoja.getInstancia().getListaNodosHoja().size();
                    System.out.println("Variable control trama: "+controlTama);
                    JOptionPane.showMessageDialog(null, "Continua a la siguiente Fase");

                }
                JOptionPane.showMessageDialog(null, "Finalizo fases del torneo");
                //panelMostrar.setVisible(true);
            }
        });
        preordenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(NodosHoja.getInstancia().getListaNodosHoja().get(0).preOrden());
            }
        });
    }
}
