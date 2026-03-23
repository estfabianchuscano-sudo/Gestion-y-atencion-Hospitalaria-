/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author fabian
 */

import com.murcia.utils.*;

public class Hospital {

    private String nombre;
    private String direccion;

    private ListaEnlazada<Paciente> listaPacientes;
    private ListaEnlazada<Medico> listaMedicos;
    private ListaEnlazada<Cita> listaCitas;

    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

        listaPacientes = new ListaEnlazada<>() {};
        listaMedicos = new ListaEnlazada<>() {};
        listaCitas = new ListaEnlazada<>() {};
    }

    public void registrarPaciente(Paciente paciente) {
        listaPacientes.add(paciente); // depende de tu librería
    }

    public void registrarMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    public ListaEnlazada<Paciente> getPacientes() {
        return listaPacientes;
    }

    public ListaEnlazada<Medico> getMedicos() {
        return listaMedicos;
    }
}