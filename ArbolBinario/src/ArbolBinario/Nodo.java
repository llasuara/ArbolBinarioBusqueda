/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author llasu
 */
public class Nodo {
    protected Object dato;
    protected Nodo izquierdo;
    protected Nodo derecho;
    
    public Nodo(Object valor){
        dato=valor;
        izquierdo = null;
        derecho = null;
    }
    public Nodo(Nodo ramaIzquierda, Object dato, Nodo ramaDerecha){
        this(dato);//llama al constructor de arriba e iguala a is y derecha en null
        izquierdo = ramaIzquierda;
        derecho = ramaDerecha;
    }
    //Operaciones de aceso;
    public Object valorNodo(){
        return dato;
        
    }
    public Nodo subArbolIzquierdo(){
        return izquierdo;
    }
    public Nodo subArbolDerecho(){
        return derecho;
    }
    public void nuevoValor(Object d){
        dato=d;
    }
    public void ramaIzquierda(Nodo n){
        izquierdo = n;
    }
    public void ramaDerecha(Nodo n){
        derecho = n;
    }
    public void visitar(){
        System.out.print(dato);
    }
    
}
