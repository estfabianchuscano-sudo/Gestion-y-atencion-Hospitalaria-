package com.mycompany.proyecto;

/**
 *
 * @author fabian
 */
class Medico {
    
   
    private int id;
    private String nombre;
    private String especialidad;

    public Medico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico: " + nombre + " - Esp: " + especialidad;
    }
}
    
