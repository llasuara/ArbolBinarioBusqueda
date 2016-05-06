/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AB_Busqueda;

/**
 *
 * @author llasu
 */
public class ArbolBinarioBusqueda extends ArbolBinario {

    public ArbolBinarioBusqueda() {
        super();
    }

     
    public Nodo buscar(Object buscado){
        Comparador dato;
        dato =(Comparador) buscado;//buscado es Estudiante
        if(raiz==null){
            return null;
        }
        else{
            return localizar(raizArbol(),dato);
        }
    }
   protected Nodo localizar(Nodo raizSub, Comparador buscado ){
       if(raizSub==null){
           return null;
       }
       else if(buscado.igualQue(raizSub.valorNodo())){
         return raiz;  
       }
       else if(buscado.menorQue(raizSub.valorNodo())){
           return localizar(raizSub.subArbolIzquierdo(), buscado);
       }
       else{
           return localizar(raizSub.subArbolDerecho(), buscado);
       }
   }
   public void insertar(Object valor)throws Exception{
       Comparador dato;
       dato=(Comparador) valor;
       raiz = insertar(raiz, dato);
   }
    //metodo interno para realizar la operacion
   protected Nodo 
   insertar(Nodo raizSub, Comparador dato)throws Exception{
       if(raizSub==null)
           raizSub = new Nodo(dato);
       else if(dato.menorQue(raizSub.valorNodo())){
           Nodo iz;
           iz = insertar(raizSub.subArbolIzquierdo(), dato);
           raizSub.ramaIzquierda(iz);
       }
       else if(dato.mayorQue(raizSub.valorNodo())){
           Nodo dr;
           dr=insertar(raizSub.subArbolDerecho(), dato);
           raizSub.ramaDerecha(dr);
       }
       else
           throw new Exception("Nodo duplicado");
           return raizSub;
       
   }
   
    
    
}//Fin de la clase
