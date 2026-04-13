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
    private int contadorcitas = 1;

    public Hospital() {
        pacientes = new ListaEnlazada<>() {};
        medicos = new ListaEnlazada<>() {};
        citas = new ListaEnlazada<>() {};
    }

    public int generarIdPaciente() {
    return contadorPacientes++;
    }
    
    public int generarIdCita() {
    return contadorcitas++;
}
    
    public void registrarPaciente(Paciente p) {
    pacientes.add(p);
    }
    
    public int cantidadPacientes() {
    return pacientes.size();
    }

    public void registrarMedico(Medico m) {
        medicos.add(m);
    }
    
    public void agregarCita(Cita c) {
    citas.add(c);
    }

    public ListaEnlazada<Paciente> getPacientes() {
        return pacientes;
    }

    public ListaEnlazada<Medico> getMedicos() {
        return medicos;
    }
    
    //metodoa para mostras y buscar
    
    public void mostrarMedicos() {
    for (int i = 0; i < medicos.size(); i++) {
        System.out.println(medicos.get(i));
    }
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
    public void mostrarPacientes() {
    for (int i = 0; i < pacientes.size(); i++) {
        System.out.println(pacientes.get(i));
    }
    }
    
    public void mostrarCitas() {
    for (int i = 0; i < citas.size(); i++) {
        System.out.println(citas.get(i));
    }
    }
    
    public void eliminarCita(int index) {
    citas.remove(index);
    }
 
}