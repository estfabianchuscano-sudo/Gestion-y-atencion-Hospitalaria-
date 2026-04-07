package com.mycompany.proyecto;

import com.murcia.utils.*;

public class Proyecto {
   
    public static void main(String[] args) {
          
    String option[] = {
    "1. Registrar pacientes",
    "2. Asignar citas",
    "3. Atender pacientes",
    "4. Ver informacion del paciente",
    "5. Salir del sistema"
};   
    Hospital hospital = new Hospital();
    
    Menu menu = new Menu(option, 'V', "   ", "MENU DE INICIO");   
    
     char sel;

        do {
            sel = menu.select("Seleccione su respuesta");

            switch (sel) {

                case '1':
                    System.out.println("Registrar paciente");

                    String nombre = Input.next("Nombre: ");
                    int edad = Input.nextInt("Edad: ");
                    String genero = Input.next("Genero: ");
                    String documento = Input.next("Documento: ");

                    Paciente p = new Paciente(1, nombre, edad, genero, documento);
                    hospital.registrarPaciente(p);

                    System.out.println("Paciente registrado");
                    break;

                case '2':
                    System.out.println("Asignar cita");
                    
                    System.out.println("Asignar cita (en construcción)");
   
                    break;

                case '3':
                    System.out.println("Atender paciente");
                    
                    break;

                case '4':
                    System.out.println("Ver información");
                    break;

                case '5':
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        } while (sel != '5');
    
    
    }
}
