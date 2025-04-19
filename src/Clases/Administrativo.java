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
public class Administrativo extends Empleado{
    
    private double salarioBase;
    private double salario;

    //TODO: Puedo modificar el tipoadministrativo y dejarlo como un objeto vacio, y dependiendo del personal puedo hacer un push al objeto, así evito recrearla.
    private Object[] tipoAdministrativo = {"RH","Mantenimiento"};
    private String tpAdmin;
    
    public Administrativo(String nombre, int cedula, String dependencia){
        super(nombre, cedula, dependencia);
    }
    
    //Setters & getters
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public void setTipoAdministrativo(String tipo) {
        this.tpAdmin = tipo;
    }
    
    public String getTipoAdministativo(){
        return tpAdmin;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    

    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    //Uso este método para retornar el salario del empleado siendo De RHumanos o Mantenimiento.
    public double getSalario(){
        return salario;
    }
    
    
    
    
    //Función para aplicar @override
    public void calcularSalario(){}
    
    
    
    
}
