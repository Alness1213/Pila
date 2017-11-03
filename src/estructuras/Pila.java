/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author Usuario
 */
public class Pila <T>{
    private Nodo top;
    private int size;
    
    public Pila(){
        size = 0;
        top = null;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    //empujar
    public void push(T data){
        Nodo p = new Nodo(data,null,size++);
        p.setNext(top);
        top = p;
    }
    
    //sacar
    public T pop(){
        Object aux = top.getInfo();
        top = top.getNext();
        size--;
        return (T)aux;
    }
    
    //tamaño
    public int size(){
        return size;
    }
    
    public void cleanPila(){
        while(!isEmpty()){
            pop();
        }
    }
    
}
