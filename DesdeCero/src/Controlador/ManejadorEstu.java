/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.AlmacenamientoEstudiante;
import Modelo.Estudiante;
import Vista.VentanitaEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author llasu
 */
public class ManejadorEstu implements ActionListener {
    
    VentanitaEstudiante windows;
    AlmacenamientoEstudiante arrayE;
    private Estudiante estu;

    public ManejadorEstu(VentanitaEstudiante ventanita,AlmacenamientoEstudiante almacenamiento) {
        
        windows=ventanita;
        arrayE = almacenamiento;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Agregar")){
            estu = new Estudiante(windows.getTextField1(),windows.getTextField2(),windows.getTextField3());
            if(arrayE.Agregar(estu)){
                windows.limpiar();
                System.out.println("El estudiante se ha agregado con éxito");
            }
            else{
                windows.limpiar();
                System.out.println("No existe estudiante registrado con el numero de cedula ingresado");
            }
            
            
        }
        else if (e.getActionCommand().equals("Eliminar")){
            if(arrayE.eliminar(windows.getTextField2())){
                windows.limpiar();
                System.out.println("El estudiante se ha eliminado con exito");
            }
            else{
                windows.limpiar();
                System.out.println("No se ha encontrado estudiante con el numero de cedula ingresado");
            }
        }
    }
}
