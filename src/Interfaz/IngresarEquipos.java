package Interfaz;

import Clases.Arbol;
import Clases.NodosHoja;

import javax.swing.*;
import java.awt.event.*;

public class IngresarEquipos extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JLabel txtNumEquipo;

    public IngresarEquipos(int contadorEquipo) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        txtNumEquipo.setText(""+contadorEquipo);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //onOK();
                Arbol.setResultadoFinal(textField1.getText()+"\n");
                NodosHoja.getInstancia().addArbol(new Arbol(textField1.getText(),textField1.getText()));
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

   /* public static void main(String[] args) {
        IngresarEquipos dialog = new IngresarEquipos();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }*/
}
