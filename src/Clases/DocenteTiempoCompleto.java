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
public class DocenteTiempoCompleto extends Docente{
    double salario;
    private String nivelEstudio;
    //Atributo que esta en la clase pero aún no tiene utilidad.
    private int toralHorasInvestigacion;
    
    public DocenteTiempoCompleto(String nombre,int cedula, String dependencia,double salario){
        super(nombre, cedula, dependencia);
    }

    //Gettes & setters
    
    public void setNivelEstudio(String[] niveles) {
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Nivel de Estudio",
                JOptionPane.QUESTION_MESSAGE,
                null,
                niveles,
                niveles[0]
        );

        if (seleccion != null) {
            this.nivelEstudio = seleccion;
            
        } else {
            this.nivelEstudio = "No definido";
        }
    }
    
    public String getNivelEstudio(){
        return nivelEstudio;
    }
    
    @Override
    public void calcularSalario() {
        if (nivelEstudio.equalsIgnoreCase("Pregrado")) {
            this.salario = 1600000;
        } else if (nivelEstudio.equalsIgnoreCase("Maestria")) {
            this.salario = 2000000;
        } else if (nivelEstudio.equalsIgnoreCase("Doctorado")) {
            this.salario = 4000000;
        }

        if (getCalificacionAsignada() > 4.5) {
            this.salario += 200000;
        }

        setSalario(this.salario); // Guarda el salario en la clase Docente
    }
    
    
    
}
