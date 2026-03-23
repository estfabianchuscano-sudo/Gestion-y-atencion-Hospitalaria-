package com.mycompany.proyecto;  
/**
 *
 * @author fabian
 */
import com.murcia.utils.*;

public class Paciente {

    private int id;
    private String nombre;
    private int edad;
    private String genero;
    private String documento;

    private HistorialMedico historialMedico;

    // NUEVO: lista enlazada de consultas
    private ListaEnlazada<Consulta> consultas;

    public Paciente(int id, String nombre, int edad, String genero, String documento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;

        historialMedico = new HistorialMedico(id, this);
        consultas = new ListaEnlazada<>() {};
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public ListaEnlazada<Consulta> getConsultas() {
        return consultas;
    }

    public String getNombre() {
        return nombre;
    }
}