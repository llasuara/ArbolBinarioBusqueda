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
public class PrincipalArbolBinarioBusqueda {
    public static void main(String args[]){
     try{
           
     ArbolBinarioBusqueda arbolito=new ArbolBinarioBusqueda();
     Estudiante estu;
     Estudiante estu1;
     Estudiante estu2;
  
      estu=new Estudiante();
      estu.nombre="Llasuara";
      estu.numMat = 8;
      arbolito.insertar(estu);
      
      estu1=new Estudiante();
      estu1.nombre="Nahomhy";
      estu1.numMat=11;
      arbolito.insertar(estu1);
      
      estu2=new Estudiante();
      estu2.nombre="Michael";
      estu2.numMat =2;
      arbolito.insertar(estu2);
      
    
        
        }
        catch(Exception e){
       System.out.println(e);
        }
            
    }//Fin del main 
    
}//Fin de la clase 
