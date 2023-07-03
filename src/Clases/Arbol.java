package Clases;

public class Arbol {

    private nodoArbol raiz;
    private String nombre;
    private int nivel;
    private static String resultadoFinal;

    public Arbol() {
        raiz = null;
        nombre = null;
    }
    public Arbol(String nombre, int estado) {
        raiz = null;
        this.nombre = nombre;
        this.nivel=estado;
    }
    //public arbol(String dato) {
     //   raiz = new nodoArbol(dato, null, null);
    //}

    public Arbol(String dato, String nombre ) {
        raiz = new nodoArbol(dato, null, null);
        this.nombre = nombre;
        this.nivel=0;
    }
    /*static void preOrden (nodoArbol arbol){
        if (arbol!=null){
            System.out.println(arbol.getClave());
            preOrden(arbol.getIzq());
            preOrden(arbol.getDer());

        }

    }*/
    static String preOrden(nodoArbol arbol) {
        if (arbol == null) {
            return ""; // Si el árbol está vacío, devuelve una cadena vacía.
        } else {
            String result = arbol.getClave() + " "; // Concatena el valor del nodo actual con un espacio en blanco
            String izq = preOrden(arbol.getIzq()); // Recorre el subárbol izquierdo
            String der = preOrden(arbol.getDer()); // Recorre el subárbol derecho
            return result + izq + der; // Concatenatodo en un solo string
        }
    }



        public String preOrden(){
        return preOrden(raiz);
    }

    static void postOrden (nodoArbol arbol){
        if (arbol!=null){

            postOrden(arbol.getIzq());
            postOrden(arbol.getDer());
            System.out.println(arbol.getClave());
        }

    }

    public void postOrden(){
        postOrden(raiz);
    }


    static void ordenCentral (nodoArbol arbol){
        if (arbol!=null){

            ordenCentral(arbol.getIzq());
            System.out.println(arbol.getClave());
            ordenCentral(arbol.getDer());

        }

    }

    public void ordenCentral(){
        ordenCentral(raiz);
    }

    public boolean juntar (String dato, Arbol a1, Arbol a2){
        if(a1.raiz==a2.raiz && a1.raiz!=null) {
            System.out.println("no se puede mezclar los árboles");
            return false;
        }
        raiz =new nodoArbol(dato, a1.raiz,a2.raiz);
        //this.nombre=nombre;
        return true;
    }

    public nodoArbol getRaiz() {
        return raiz;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public static void setResultadoFinal(String resultadoFinal) {
        Arbol.resultadoFinal = Arbol.resultadoFinal+resultadoFinal;
    }

    public static String getResultadoFinal() {
        return resultadoFinal;
    }
}
