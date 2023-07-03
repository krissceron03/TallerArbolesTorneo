import Interfaz.IngresoEquipos;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                IngresoEquipos principalForm = new IngresoEquipos();
                principalForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                principalForm.setBounds(200,200,800,500);
                principalForm.setContentPane(principalForm.getMainPanel());
                principalForm.setVisible(true);

                /*arbol a1= new arbol("1");
                arbol a3= new arbol("3");
                arbol a5= new arbol("5");
                arbol a7= new arbol("7");
                arbol a2= new arbol();
                arbol a4= new arbol();
                arbol a6= new arbol();
                a2.juntar("2",a1,a3);
                a6.juntar("6",a5,a7);
                a4.juntar("4",a2,a6);
                System.out.println("-----------");
                System.out.println("a4 en preorden");
                a4.preOrden();
                System.out.println("-----------");
                System.out.println("a4 en orden Central");
                a4.ordenCentral();
                int aux= PruebArbol.sumaClaves(a4);
                System.out.println(aux);
                System.out.println("-----------");
                int aux3= PruebArbol.cuentaHojas(a4.getRaiz());
                System.out.println("En a4 hay: "+aux3+" hojas");
                System.out.println("-----------");
                PruebArbol.clavesNiveles(a4.getRaiz(),1);*/

            }
        });

    }
}
