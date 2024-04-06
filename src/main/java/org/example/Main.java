package org.example;

import org.example.Listas.Lista;
import org.example.Listas.nodo;


public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        var respuesta = l.crearLista();
        respuesta.visualizar();

    }
}