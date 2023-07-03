package Interfaz;

import Clases.Arbol;
import Clases.NodosHoja;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class AsignarEquipos1 extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JLabel txtEtapa;
    private JLabel txtPartido;

    public AsignarEquipos1(int contadorPartidos,int contadorFase) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        cargarComboBoxPARTIDOS(contadorFase);
        txtEtapa.setText(""+contadorFase);
        txtPartido.setText(""+contadorPartidos);
        Arbol.setResultadoFinal("Partido"+contadorPartidos+"\n");

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //onOK();
                //CAMBIAR NOMBRE
                String ganador="";
                Arbol A=new Arbol("Equipo: "+comboBox1.getSelectedItem().toString()+" Gano Partido: "+contadorPartidos,contadorFase);
                Arbol.setResultadoFinal("Equipo Ganador: "+comboBox3.getSelectedItem().toString()+"\n");
                if(comboBox3.getSelectedIndex()==0){
                    ganador=comboBox1.getSelectedItem().toString();
                }
                if(comboBox3.getSelectedIndex()==1){
                    ganador=comboBox2.getSelectedItem().toString();
                }
                A.juntar(ganador,NodosHoja.getInstancia().busquedaEquipo(comboBox1.getSelectedItem().toString()),NodosHoja.getInstancia().busquedaEquipo(comboBox2.getSelectedItem().toString()));
                NodosHoja.getInstancia().addArbol(A);
                NodosHoja.getInstancia().borrarLista(NodosHoja.getInstancia().busquedaEquipo(comboBox1.getSelectedItem().toString()));
                NodosHoja.getInstancia().borrarLista(NodosHoja.getInstancia().busquedaEquipo(comboBox2.getSelectedItem().toString()));
                System.out.println("Tamaño del arreglo "+ NodosHoja.getInstancia().getListaNodosHoja().size());
                dispose();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    /*public static void main(String[] args) {
        AsignarEquipos1 dialog = new AsignarEquipos1();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }*/
    private void cargarComboBoxPARTIDOS(int contadorFase) {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>();
        comboBox1.setModel(comboBoxModel);
        comboBox2.setModel(comboBoxModel2);
        List<String> nombres = NodosHoja.getInstancia().detalleNombre(contadorFase-1);//gestion
        String nombre = "";
        for (int i = 0; i < nombres.size(); i++) {
            nombre = nombres.get(i);
            comboBoxModel.addElement(nombre);
            comboBoxModel2.addElement(nombre);
        }
    }
}
