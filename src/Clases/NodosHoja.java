package Clases;

import java.util.ArrayList;
import java.util.List;

public class NodosHoja {
    private static NodosHoja instancia;
    private List<Arbol> listaNodosHoja;
    public static NodosHoja getInstancia() {
        if (instancia == null) {
            instancia  =new NodosHoja();
        }
        return instancia;
    }
    private NodosHoja() {
        this.listaNodosHoja = new ArrayList<Arbol>();
    }

    public void addArbol(Arbol ad){
        listaNodosHoja.add(ad);
    }

    public List<Arbol> getListaNodosHoja() {
        return listaNodosHoja;
    }
    public Arbol busquedaEquipo(String nombre){
        for (Arbol arbol1 : listaNodosHoja) {
            if(arbol1.getNombre().equals(nombre)){
                return arbol1;
            }
        }
        return null;
    }
    public boolean borrarLista(Arbol ar){
        if (listaNodosHoja.contains(ar)) {
            listaNodosHoja.remove(listaNodosHoja.indexOf(ar));
            System.out.println("Objeto eliminado: " + ar);
            return true;
        } else {
            System.out.println("El objeto no está en la lista.");
            return false;
        }
    }
    public List<String> detalleNombre(int Estado){
        List<String> nombres=new ArrayList<String>();
        for (Arbol arbol1 :listaNodosHoja ) {
            if(arbol1.getNivel()==Estado){
                nombres.add(arbol1.getNombre());
            }
        }
        return nombres;
    }


}
