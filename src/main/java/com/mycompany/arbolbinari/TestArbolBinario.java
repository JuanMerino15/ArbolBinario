/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arbolbinari;

/**
 *
 * @author juan
 */
public class TestArbolBinario {
    
     Nodo inicial;
     
    public TestArbolBinario() {
        
        this.inicial = null;
    }
    
    public void insertar ( int valor ) {
        
        if ( this.inicial == null ) { // Esto se realiza si no hay hojas en el arbol
            this.inicial = new Nodo ( valor );
            
        } else {
            this.inicial.insertar(valor);
        }
    }
    
    // Preorden
    
    public void Preorden() {
        this.preorden(this.inicial);
    }
    
    public void preorden ( Nodo nodo ) {
        if ( nodo == null) {
            return; // aqui se detiene la recursividad
        } else {
            System.out.print(nodo.getValor() + " - ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodoDer());
        }
    }
    
    // InOrden
    
    public void Inorden() {
        this.inorden(this.inicial);
    }
    
    public void inorden ( Nodo nodo ) {
        if ( nodo == null) {
            return; // detener recursividad
        } else {
            inorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor() + " - ");
            inorden(nodo.getNodoDer());
        }
    }
    
    // PostOrden
    
    public void Postorden() {
        this.postorden(this.inicial);
    }
    
    public void postorden ( Nodo nodo ) {
        if ( nodo == null) {
            return; // detener recursividad
        } else {
            postorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor() + " - ");
            postorden(nodo.getNodoDer());
        }
    }
}
