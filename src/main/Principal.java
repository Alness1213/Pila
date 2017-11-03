/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import estructuras.Pila;

/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args){
        Pila<Integer> numeros = new Pila<>();
        
        numeros.push(12);
        numeros.push(2);
        numeros.push(8);
        numeros.push(35);
        numeros.push(99);
        
        System.out.println(numeros.isEmpty());
        
        while(!numeros.isEmpty()){
            System.out.println(numeros.pop());
        }
        
        System.out.println(numeros.isEmpty());
        
    }
    
}
