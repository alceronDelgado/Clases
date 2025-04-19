/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author lalej
 */
public class Empleado {
       
    private String nombre;
    private int cedula;
    private String dependencia;
    
    //Constructor.
    public Empleado(String nombre,int cedula, String dependencia){
        this.nombre = nombre;
        this.cedula = cedula;
        this.dependencia = dependencia;
    }
    //Setters & Getters
    public void setNombre(){
        
        this.nombre = JOptionPane.showInputDialog(null,"Nombre del docente:");
    }
    
        
    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    public void setDependencia(String dependencia){
        this.dependencia = dependencia;
    }
    
    
        
        

}
