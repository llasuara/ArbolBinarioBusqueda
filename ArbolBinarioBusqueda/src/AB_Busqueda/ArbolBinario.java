package AB_Busqueda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author llasu
 */
public class ArbolBinario {
    protected Nodo raiz;
    public ArbolBinario(){
        raiz = null;
    }
    public ArbolBinario(Nodo raiz){
        this.raiz=raiz;
    }
    public Nodo raizArbol(){
        return raiz;
    }
    //Comprueba el status del arbol
    public boolean esVacio(){
        return raiz == null;
    }
    //Este metodo nuevoArbol() crea  un arbol de raiz Nodo con el campo dato, rama iz y derecha pasadas en los argumentos
    public static Nodo nuevoArbol(Nodo ramaIzquierda,Object dato, Nodo ramaDerecha){
        return new Nodo(ramaIzquierda,dato,ramaDerecha);//Retorna NODO
    }
    public static void preOrden(Nodo r){
        if(r!=null){
            r.visitar();
            preOrden(r.subArbolIzquierdo());
            preOrden(r.subArbolDerecho());
            
        }
    }
    public static void enOrden(Nodo r){
        if(r!=null){
            enOrden(r.subArbolIzquierdo());
            r.visitar();
            enOrden(r.subArbolDerecho());
            
        }
    }
    public static void postOrden(Nodo r){
        if(r!=null){
            postOrden(r.subArbolIzquierdo());
            postOrden(r.subArbolDerecho());
            r.visitar();
        }
    }
    public static int numNodos(Nodo raiz){
        if(raiz==null){
            return 0;
        }
        else{
            return 1+ numNodos(raiz.subArbolIzquierdo())+
                      numNodos(raiz.subArbolDerecho());
        }
              
           
    }
}//FIn de la clase
