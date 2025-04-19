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
public class RHumanos extends Administrativo{
    private Object[] tipoRh = {"Tesoreria","Secretaria"};
    private String tpRh;
    double salario;
    
    public RHumanos(String nombre,int cedula, String dependencia){
        super(nombre, cedula, dependencia);
    }
    
    //Setters & Getters
    public void setTipoRh(){
     // Dependencia a la que pertenece.
        String selectTipoRh = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione una opción",
            "Dependencia",
            JOptionPane.QUESTION_MESSAGE,
            null,
            tipoRh,
            tipoRh[0]
        );
        
        this.tpRh = selectTipoRh;
        
    }
    
    public String getTipoRh(){
    
        return tpRh;
    }
    
    @Override
    public void calcularSalario(){
        if (getTipoRh().equalsIgnoreCase("Tesoreria")) {
            this.salario = getSalarioBase() + 100000;
        }else if(getTipoRh().equalsIgnoreCase("Secretaria")){
            this.salario = getSalarioBase() + 70000;
        }
        
        setSalario(this.salario);
        
    }
}
