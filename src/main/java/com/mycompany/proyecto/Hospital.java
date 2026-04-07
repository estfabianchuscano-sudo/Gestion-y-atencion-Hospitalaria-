package com.mycompany.proyecto;

/**
 *
 * @author fabian
 */

import com.murcia.utils.*;

public class Hospital {

  

    private ListaEnlazada<Paciente> pacientes;
    private ListaEnlazada<Medico> medicos;

    public Hospital() {
        pacientes = new ListaEnlazada<>() {};
        medicos = new ListaEnlazada<>() {};
    }

    public void registrarPaciente(Paciente p) {
        pacientes.add(p); 
    }

    public void registrarMedico(Medico m) {
        medicos.add(m);
    }

    public ListaEnlazada<Paciente> getPacientes() {
        return pacientes;
    }

    public ListaEnlazada<Medico> getMedicos() {
        return medicos;
    }
}