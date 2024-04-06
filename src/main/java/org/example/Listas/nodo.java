package org.example.Listas;

public class nodo {
    String dato;
    nodo enlace;
    public nodo(String x){
    dato = x;
    enlace = null;

    }

    public nodo(String x, nodo n){
        dato = x;
        enlace = n;
    }

    public nodo getEnlace(){
        return enlace;
    }

    public void setEnlace(nodo n){
        enlace = n;
    }

    @Override
    public String toString() {
        return "nodo{" +
                "dato=" + dato +
                ", enlace=" + enlace +
                '}';
    }
}
