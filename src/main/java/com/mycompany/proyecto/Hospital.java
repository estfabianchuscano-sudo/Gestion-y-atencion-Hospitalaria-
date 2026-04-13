package com.mycompany.proyecto;

/**
 *
 * @author fabian
 */

import com.murcia.utils.*;

public class Hospital {

  

    private ListaEnlazada<Paciente> pacientes;
    private ListaEnlazada<Medico> medicos;
    private ListaEnlazada<Cita> citas = new ListaEnlazada<>() {};
    private int contadorPacientes = 1;

    public Hospital() {
        pacientes = new ListaEnlazada<>() {};
        medicos = new ListaEnlazada<>() {};
        citas = new ListaEnlazada<>() {};
    }

    public int generarIdPaciente() {
    return contadorPacientes++;
}
    
    public void registrarPaciente(Paciente p) {
    pacientes.add(p);
    System.out.println("DEBUG: Paciente agregado -> " + p);
    }
    
    public int cantidadPacientes() {
    return pacientes.size();
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
    
    public Paciente buscarPaciente(String documento) {
    for (int i = 0; i < pacientes.size(); i++) {
        Paciente p = pacientes.get(i);

        if (p.getDocumento().equals(documento)) {
            return p;
        }
    }
    return null;
}
    public void agregarCita(Cita c) {
    citas.add(c);
}
}