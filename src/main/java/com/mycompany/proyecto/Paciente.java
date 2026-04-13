package com.mycompany.proyecto;  
/**
 *
 * @author fabian
 */
   
  
public class Paciente {

    private int id;
    private String nombre;
    private int edad;
    private String genero;
    private String documento;
  
    public Paciente(int id, String nombre, int edad, String genero, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " - Doc: " + documento;
    }
}