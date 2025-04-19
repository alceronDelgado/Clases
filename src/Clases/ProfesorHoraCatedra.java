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
public class ProfesorHoraCatedra extends Docente{
    private int cantidadHoras;
    double resultado;
    
    public ProfesorHoraCatedra(String nombre, int cedula, String dependencia){
        super(nombre, cedula, dependencia);
    }
    
    //setters & getters.
    public void setHorasAsignadas(){
        
        this.cantidadHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de horas del contratista"));
        
    
    }
    
    public int getHorasAsignadas(){
    
        return cantidadHoras;
    }
    
        
    /**
     * Si voy a trabajar 10 HORAS SEMALAES, CUANTAS SON AL MES? 40... Entonces 40 lo multiplico 
     * por 150.000
     */
    @Override
    public void calcularSalario(){
        resultado = getHorasAsignadas() * 150000;
        
        //Lo asigno a la clase padre docente.
        setSalario(resultado);
    }

}
