/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import javax.swing.*;
/**
 *
 * @author lalej
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] dependencia = {"EISC", "EIEE", "Otro"};        
        String[] niveles = {"Pregrado", "Maestria", "Doctorado"};
        Object[] tipoDocente = {"Tiempo Completo", "Horas"};
        
        // Dependencia a la que pertenece.
        String selectDependencia = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione una opción",
            "Dependencia",
            JOptionPane.QUESTION_MESSAGE,
            null,
            dependencia,
            dependencia[0]
        );
        
       //Tipo Docente. = Por horas o tiempo Completo
        int seleccionDocente = JOptionPane.showOptionDialog(
                null,
                "Seleccione el tipo de docente",
                "Tipo de Docente",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipoDocente,
                tipoDocente[0]
        );
        
       
        int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Cedula docente:"));
        
        double salario = 0.0;
        String nombre = JOptionPane.showInputDialog(null,"Nombre del docente:");
        
        //Si es 0, creamos un objeto de docente a tiempoCompleto, si es 1, docente por horas.
        if (seleccionDocente == 0) {
            
            double calificacionAsignada = Double.parseDouble(JOptionPane.showInputDialog(null,"Calificación Promedio:"));
            
            //Instancia de la clase docente.
            DocenteTiempoCompleto docentrCompleto = new DocenteTiempoCompleto(nombre, cedula, selectDependencia, salario);
            
            //Métodos
            docentrCompleto.setCalificacionAsignada(calificacionAsignada);
            docentrCompleto.setTipoDocente(seleccionDocente);
            docentrCompleto.setNivelEstudio(niveles);
            String nivelEstudio = docentrCompleto.getNivelEstudio();
            docentrCompleto.calcularSalario();

            //Mostrar el mensaje total
            JOptionPane.showMessageDialog(
    null,
        "📄 Salario del Docente Tiempo Completo:\n\n" +
        "👤 Tipo de docente: " + docentrCompleto.getTipoDocente() + "\n" +
        "🎓 Nivel de estudio: " + nivelEstudio + "\n" +
        "💰 Salario total: $" + docentrCompleto.getSalario()
        );
           
            
            //Cuando el docente sea por horas.
        }else if(seleccionDocente == 1){
            
            ProfesorHoraCatedra contratista = new ProfesorHoraCatedra(nombre, cedula, selectDependencia);
            contratista.setHorasAsignadas();
            contratista.calcularSalario();
            
            //Mostrar el mensaje total
            JOptionPane.showMessageDialog(
    null,
        "📄 Salario del Docente Por Horas.:\n\n" +
        "🎓 Cantidad de horas laboradas por mes.: " + contratista.getHorasAsignadas() + "\n" +
        "💰 Salario total: $" + contratista.getSalario()
        );
            
            
        }

               
   }
    
}
