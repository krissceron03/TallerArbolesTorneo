package Interfaz;

import Clases.Arbol;
import Clases.NodosHoja;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresoEquipos extends JFrame {
    private JComboBox comboBox1;
    private JButton aceptarButton;
    private JPanel mainPanel;

    public IngresoEquipos() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Control guarda cuantos equipos nos va a meter el usuario
                int control;
                control=Integer.parseInt(comboBox1.getSelectedItem().toString());

                //Concatenador de String
                Arbol.setResultadoFinal("--EQUIPOS INGRESAN--"+"\n");

                // Creara arboles hoja con nombre del equipo
                for (int i = 0; i < control; i++) {
                    IngresarEquipos ingresar=new IngresarEquipos(i+1);
                    ingresar.setVisible(true);
                    //VALIDAR VALIDAR
                }
                EtapasPartido p1= new EtapasPartido("ETAPAS DE EQUIPO");
                p1.setVisible(true);
                //dispose();
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
