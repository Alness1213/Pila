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
public class Nodo {
    private Object info;
    protected Nodo next;
    private int index;

    public Nodo(Object info,Nodo next, int index) {
        this.info = info;
        setNext(next);
        this.index = index;
    }
    
    public void setNext(Nodo next){
        this.next = next;
    }
    
    public Nodo getNext(){
        return next;
    }

    public Object getInfo() {
        return info;
    }


    public int getIndex() {
        return index;
    }
    
}
