    package com.mycompany.proyecto;

import com.murcia.utils.*;

public class Proyecto {
   
    public static void main(String[] args) {
          
    String option[] = {
    "1. Registrar pacientes",
    "2. Asignar citas",
    "3. Buscar un paciente",
    "4. Ver cantidad de pacientes",
    "5. Atender pacientes",
    "6. Salir del sistema"
};   
    Hospital hospital = new Hospital();
    
    hospital.registrarMedico(new Medico(1, "Dr. Juan", "General"));
    hospital.registrarMedico(new Medico(2, "Dra. Ana", "Pediatria"));
    hospital.registrarMedico(new Medico(3, "Dr. Carlos", "Cardiologia"));
    hospital.registrarMedico(new Medico(4, "Dra. Laura", "Dermatologia"));
    
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

                    Paciente p = new Paciente(
                    hospital.generarIdPaciente(),
                    nombre, edad, genero, documento
                    ); 
                   
                    hospital.registrarPaciente(p);
                    
                    System.out.println("Paciente registrado");
                    break;

                case '2':
                String doc = Input.next("Documento paciente: ");
                Paciente pac = hospital.buscarPaciente(doc);

                if (pac != null) {
                    hospital.mostrarMedicos();
                    int op = Input.nextInt("Seleccione medico: ");

                    Medico m = hospital.getMedicos().get(op - 1);

                    String hora = Input.next("Hora: ");

                    Cita c = new Cita(
                        hospital.generarIdCita(),
                        new java.util.Date(),
                        hora,
                        pac,
                        m
                    );

                    hospital.agregarCita(c);

                    System.out.println("Cita asignada");
                } else {
                    System.out.println("Paciente no encontrado");
                }
                Input.next(""); 
                break;
   
                case '3':
                    System.out.println("Buscar paciente");

                    String d = Input.next("Documento: ");
                    Paciente encontrado = hospital.buscarPaciente(d);
                    
                    if (encontrado != null) {
                    System.out.println(encontrado);
                    } else {
                    System.out.println("Paciente no encontrado");
                    }
                    
                    break;

                case '4':
                    System.out.println("Cantidad de pacientes: " + hospital.cantidadPacientes());
                    break;
  
                case '5':
                    System.out.println("Atender paciente");

                    if (hospital.getCitas().size() == 0) {
                        System.out.println("No hay citas registradas");
                        break;
                    }

                    hospital.mostrarCitas();

                    int op = Input.nextInt("Seleccione cita a atender: ");

                    if (op < 1 || op > hospital.getCitas().size()) {
                        System.out.println("Opción inválida");
                    } else {
                        hospital.eliminarCita(op - 1);
                        System.out.println("Paciente atendido y cita eliminada");
                    }

                    break;

                
                case '6':
                    System.out.println("Saliend1o del sistema");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        } while (sel != '6');
    
    
    }
}
