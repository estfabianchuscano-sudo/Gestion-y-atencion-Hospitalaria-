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

                    Paciente p = new Paciente(hospital.generarIdPaciente(), nombre, edad, genero, documento);
                    
                    System.out.println("Paciente registrado");
                    break;

                case '2':
                    System.out.println("Asignar cita");
                    
                    String docCita = Input.next("Documento del paciente: ");
                    Paciente pac = hospital.buscarPaciente(docCita);

                    if (pac != null) {
                    String hora = Input.next("Hora: ");

                    Medico m = new Medico(1, "Dr. Juan", "General");

                    Cita cita = new Cita(1, new java.util.Date(), hora, pac, m);
                    hospital.agregarCita(cita);

                    System.out.println("Cita asignada");
                    } else {
                    System.out.println("Paciente no encontrado");
                    }   
                    break;
   
                case '3':
                    System.out.println("Buscar paciente");

                    String doc = Input.next("Ingrese documento: ");
                    Paciente encontrado = hospital.buscarPaciente(doc);

                    if (encontrado != null) {
                    System.out.println(encontrado);
                    } else {
                    System.out.println("Paciente no encontrado");
                    }
                    break;

                case '4':
                    System.out.println("Lista de pacientes:");

                    for (int i = 0; i < hospital.getPacientes().size(); i++) {
                    Paciente p2 = hospital.getPacientes().get(i);
                    System.out.println(p2);
                    }

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
