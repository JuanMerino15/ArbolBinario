/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinari;

/**
 *
 * @author juan
 */
public class OrdenarArbolBinario {
     public static void main(String[] args) {
        TestArbolBinario arbol = new TestArbolBinario();
        
        arbol.insertar(20);
        arbol.insertar(45);
        arbol.insertar(100);        
        arbol.insertar(17);
        arbol.insertar(995);

        System.out.println("InOrden: ");
        arbol.Inorden();
        System.out.println("");
        
        System.out.println("PostOrden: ");
        arbol.Postorden();
        System.out.println("");

        System.out.println("PreOrden: ");
        arbol.Preorden();
        System.out.println("");



    }
    
}
