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
        Object[] tipoEmpleado = {"Docente","Administrativo"};
        
        //Validar que tipo de empleado es, si es docente o administrativo.
        String empleado = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione una opción",
            "Dependencia",
            JOptionPane.QUESTION_MESSAGE,
            null,
            tipoEmpleado,
            tipoEmpleado[0]
        );
        
        int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Cedula docente:"));
        String nombre = JOptionPane.showInputDialog(null,"Nombre del docente:");

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
        
        switch (empleado) {
            case "Docente":

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

                double salario = 0.0;

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
                
                break;
                
            case "Administrativo":
                
                String[] tipoAdministrativo = {"RH", "Mantenimiento"};
                Administrativo admin = new Administrativo(nombre, cedula, selectDependencia);
                admin.setSalarioBase(700000);
                double salarioBase = admin.getSalarioBase();
                
                String seleccionTipoAdmin = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione el tipo de administrativo",
                    "Tipo Administrativo",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    tipoAdministrativo,
                    tipoAdministrativo[0]
                );
                
                admin.setTipoAdministrativo(seleccionTipoAdmin);
                String tpAdministrativo = admin.getTipoAdministativo();
                
                if (tpAdministrativo.equalsIgnoreCase("RH")) {
                    //creo clase llamada recursos Humanos
                    RHumanos RRHH = new RHumanos(nombre, cedula, selectDependencia);
                    RRHH.setSalarioBase(700000);
                    RRHH.setTipoRh();
                    RRHH.calcularSalario();
                    
                    JOptionPane.showMessageDialog(
                        null,
                        "📄 Empleado Administrativo - Recursos Humanos:\n\n" +
                        "👤 Nombre: " + nombre + "\n" +
                        "🆔 Cédula: " + cedula + "\n" +
                        "🏢 Dependencia: " + selectDependencia + "\n" +
                        "🗂️ Tipo Administrativo: " + tpAdministrativo + "\n" +
                        "📌 Área RH: " + RRHH.getTipoRh() + "\n" +
                        "💰 Salario Total: $" + RRHH.getSalario()
                    );
                    
                }else if(tpAdministrativo.equalsIgnoreCase("Mantenimiento")){
                    
                    Mantenimiento mnto = new Mantenimiento(nombre, cedula, selectDependencia);
                    
                    mnto.crearSala();
                    
                    //Trabaja horas extras?
                    int selectHorasExtras = JOptionPane.showOptionDialog(
                        null,
                        "¿Realizó horas extras?",
                        "Horas extras:",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Sí", "No"},
                        "Sí" // opción por defecto
                    );
                    
                    if (selectHorasExtras == 0) {
                        int cantidadHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de horas."));
                        mnto.setHorasExtra(cantidadHoras);
                    } else {
                        mnto.setHorasExtra(0); 
                    }
                    mnto.calcularSalario();
                    
                    
                    JOptionPane.showMessageDialog(
                        null,
                        "📄 Empleado Administrativo - Mantenimiento:\n\n" +
                        "👤 Nombre: " + nombre + "\n" +
                        "🆔 Cédula: " + cedula + "\n" +
                        "🏢 Dependencia: " + selectDependencia + "\n" +
                        "🔧 Salas asignadas: " + mnto.getSalaString() + "\n" +
                        "⏱️ Horas extra: " + mnto.getHorasExtra() + "\n" +
                        "💰 Salario total: $" + mnto.getSalario()
                    );
                    
                }
                
                
                break;
            default:
                throw new AssertionError();
        }
        
        
        
        
        
        

               
   }
    
}
