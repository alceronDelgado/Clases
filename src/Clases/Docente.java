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
public class Docente extends Empleado {
    protected double calificacionAsignada;
    private double salario;
    private int seleccionDocente;

    /**
     * Si el empleado es docente a tiempo Completo o por horaCatedra.
     */
    private String tipoDocente;
    
    //Constructor.
    public Docente(String nombre, int cedula, String dependencia){
        super(nombre, cedula, dependencia);
    }
    
    //setters & getters
    public void setCalificacionAsignada(double calificacionAsignada){
        this.calificacionAsignada = calificacionAsignada;
    }

    
    //Obtener el tipo docente = Si es por horas o tiempo completo.
    public void setTipoDocente(int seleccionDocente) {

        if (seleccionDocente == 0) {
            this.tipoDocente = "Tiempo Completo";
        } else if (seleccionDocente == 1) {
            this.tipoDocente = "Horas";
        } else {
            this.tipoDocente = "Desconocido";
        }
    }
    
    //Retorno el tipo del docente, si es por horas o si es completo
    public String getTipoDocente() {
        return tipoDocente;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
    
        return salario;
    }
    
    public double getCalificacionAsignada() {
        return calificacionAsignada;
    }

    public void calcularSalario(){
    
    }
    
    
    
}

