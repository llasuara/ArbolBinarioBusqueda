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
public class Estudiante implements Comparador {
    int numMat;
    String nombre;
    @Override
    public boolean igualQue(Object op2) {
      Estudiante p2= (Estudiante) op2;
      return numMat==p2.numMat;
    }

    @Override
    public boolean menorQue(Object op2) {
      Estudiante p2= (Estudiante) op2;
      return numMat<p2.numMat;
    }

    @Override
    public boolean menorIgualQue(Object op2 ) {
        Estudiante p2= (Estudiante) op2;
        return numMat<=p2.numMat;
    }

    @Override
    public boolean mayorQue(Object op2) {
      Estudiante p2= (Estudiante) op2;
      return numMat>p2.numMat;
        
    }

    @Override
    public boolean mayorIgualQue(Object op2) {
        Estudiante p2= (Estudiante) op2;
        return numMat>=p2.numMat;
        
    }

    
}
