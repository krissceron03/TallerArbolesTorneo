package Clases;

public class nodoArbol {

    private String clave;
    private nodoArbol izq;
    private nodoArbol der;
    public nodoArbol(){
        clave ="";//clase equipo
        izq=null;
        der=null;
    }
    public nodoArbol(String dato){
        clave =dato;
        izq=null;
        der=null;
    }

    public nodoArbol(String dato, nodoArbol izq, nodoArbol der){
        clave =dato;
        this.izq=izq;
        this.der=der;
    }

    public String getClave() {
        return clave;
    }

    public nodoArbol getIzq() {
        return izq;
    }

    public nodoArbol getDer() {
        return der;
    }
}
