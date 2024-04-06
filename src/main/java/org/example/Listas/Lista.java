package org.example.Listas;

import java.util.Scanner;

public class Lista {

    //Declarar variable de primer nodo
    public nodo primero;
    public Lista(){
        primero = null;
    }

    private String leerNombre(){
        System.out.println("Ingrese un nombre, -1 para terminar");
        return (new Scanner(System.in)).nextLine();
    }
    public Lista crearLista(){
        String nombre = "";
        primero = null;
        do{
            nombre = leerNombre();
            if(!nombre.equals("-1")){
                primero = new nodo(nombre, primero);
            }
        } while(!nombre.equals("-1"));
        return this;
    }


    public Lista insertarCabezaLista(String entrada){
        nodo nuevo;
        nuevo = new nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }

    public void visualizar(){
        nodo n;
        int k= 0;
        n = primero;
        while(n!=null){}
        System.out.println(n.dato + " ");
        k++;
        //Cada 15 elementos hace un salto de linea para imprimir
        System.out.print((k%15!=0 ? " " : "\n"));
    }
}
