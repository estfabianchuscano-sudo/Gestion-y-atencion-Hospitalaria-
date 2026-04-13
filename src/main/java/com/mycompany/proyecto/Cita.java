package com.mycompany.proyecto;

/**    
 *
 * @author fabian
 */
import java.util.Date;
      
public class Cita {
    private int id;
    private Date fecha;
    private String hora;
    private Paciente paciente;
    private Medico medico;
    private String estado;

    public Cita(int id, Date fecha, String hora, Paciente paciente, Medico medico) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.medico = medico;
        this.estado = "Agendada";
    }

    
    @Override
    public String toString() {
        return "Cita #" + id +
               " Paciente: " + paciente.getNombre() +
               " Medico: " + medico +
               " Hora: " + hora +
               " Estado: " + estado;
    }
    
   
    
}
