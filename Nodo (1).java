/*
1.- pedir datos
2.- datos sin repetir (avisar)
3.- preguntar al usuario como imprimir los datos
    a) pre- ordem
    b) in- orden
    c) post- orden
4.- imprimir datos en in-orden 
5.- borrador de nodo por posición y busqueda

 */
package Examen;

public class Nodo {

    private String dato;
    private Nodo derecha;
    private Nodo izquierda;

    public Nodo(String dato) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
        
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}


