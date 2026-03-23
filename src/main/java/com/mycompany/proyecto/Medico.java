/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/** 
 *
 * @author fabian
 */
public class Medico {
    private int id;
    private String nombre;
    private String especialidad;
    private boolean disponibilidad;
    
    public Medico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.disponibilidad = true;
    }

    public void atenderPaciente(Paciente paciente) {
        System.out.println("Atendiendo a: " + paciente.getNombre());
    }


    
}
