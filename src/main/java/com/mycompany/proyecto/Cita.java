/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public void cancelarCita() {
        estado = "Cancelada";
    }

    public void reprogramarCita(Date nuevaFecha, String nuevaHora) {
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
    }
}
