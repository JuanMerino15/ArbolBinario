/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinari;

/**
 *
 * @author juan
 */
public class Nodo {
     private int valor;
    private Nodo NodoIzq;
    private Nodo NodoDer;
    
    public Nodo ( int valor ) {
        this.valor = valor;
        this.NodoIzq = null;
        this.NodoDer = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoIzq() {
        return NodoIzq;
    }

    public Nodo getNodoDer() {
        return NodoDer;
    }    
    
    
    public void insertar ( int v ) {
        if ( v < this.valor ) {
            if ( this.NodoIzq == null ) {
                this.NodoIzq = new Nodo(v); 
            } else {
                this.NodoIzq.insertar(v);
            }
        } else {
            if ( this.NodoDer == null ) {
                this.NodoDer = new Nodo(v);
            } else {
                this.NodoDer.insertar(v);
            }
        }
    }
}

