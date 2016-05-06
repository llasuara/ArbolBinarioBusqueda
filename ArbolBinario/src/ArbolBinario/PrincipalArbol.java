package ArbolBinario;


/**
 *
 * @author llasu
 */
public class PrincipalArbol {
    public static  void main(String arg[]){
    ArbolBinario arbol;
    try{
    Nodo a1, a2, a;
    PilaVector pila = new PilaVector();
    a1 = ArbolBinario.nuevoArbol(null,"Maria",null);
    a2 = ArbolBinario.nuevoArbol(null,"Rodrigo",null);
    a =  ArbolBinario.nuevoArbol(a1,"Esperanza",a2);    
    a1 = ArbolBinario.nuevoArbol(null,"Anyora",null);
    a2 = ArbolBinario.nuevoArbol(null,"Abel",null);
    a =  ArbolBinario.nuevoArbol(a1,"M Jesus",a2);
    pila.insertar(a);
    
    a1 = (Nodo) pila.quitar();
    a2 = (Nodo) pila.quitar();
    a  = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
    arbol = new ArbolBinario(a);
    ArbolBinario.preOrden(a);
   
    
    
    
    }
    catch(Exception e){
       
    }
          
            
    }
    
}
