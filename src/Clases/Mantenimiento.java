/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Random;
import java.util.HashSet;

/**
 *
 * @author lalej
 */
public class Mantenimiento extends Administrativo{
    
    //Lo tenía con arrayList pero lo cambie a HashSet.
    private HashSet<String> aula = new HashSet<>();
    private String salaString = "";
    private int horasExtra;
    private double salario;
    
    public Mantenimiento(String nombre, int cedula, String dependencia){
        super(nombre, cedula, dependencia);
    }
    
    public void setHorasExtra(int horas){
        this.horasExtra = horas;
    }
    
    public void crearSala(){
        
        //Agregar el aula.
        while(aula.size() < 5){
            // Letra random entre A Hasta la D.
            char letraSala = (char) ('A' + new Random().nextInt(4));
            
            // Nmero aleatorio entre 1 y 9.
            int nroSala = (int) (Math.random() * 10);
            
            // Crear el nombre de la sala concatenando la letra y el número
            String salon = "" + letraSala + nroSala;
            
            //Evitar duplicados
            if (!this.aula.contains(salon)) {
                // Añadir el nombre de la sala a la lista
                this.aula.add(salon);
            }
        
        }
        
        this.salaString += " " + this.aula + " ";
        
    }
    
    public String getSalaString(){
        return salaString;
    }
    
    public int getHorasExtra(){
        return horasExtra;
    }
    
    @Override
    public void calcularSalario(){
        
        //Valido si la cantidad de horas extra son 0, significa que no trabajo horas extra.
        if (getHorasExtra() == 0) {
            //El salario base es de 700000
            this.salario = getSalarioBase();
            setSalario(this.salario);
            
        }else{
            this.salario = getSalarioBase() + (getHorasExtra() * 4000);
        
        }
        
        //Asigno el salario a la clase padre (administrativo)
        setSalario(this.salario);
        
    
    }
    
    
}
