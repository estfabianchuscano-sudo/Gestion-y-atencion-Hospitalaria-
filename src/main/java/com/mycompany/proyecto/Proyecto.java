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
    hospital.registrarMedico(new Medico(5, "Dr. Carlos", "Cardiologia"));
    hospital.registrarMedico(new Medico(7, "Dr. Miguel", "Neurologia"));
    hospital.registrarMedico(new Medico(8, "Dra. Sofia", "Ginecologia"));
    hospital.registrarMedico(new Medico(9, "Dr. Andres", "Ortopedia"));
    hospital.registrarMedico(new Medico(10, "Dra. Paula", "Oftalmologia"));
    hospital.registrarMedico(new Medico(11, "Dr. Juan", "Psiquiatria"));
    hospital.registrarMedico(new Medico(12, "Dra. Camila", "Endocrinologia"));
    hospital.registrarMedico(new Medico(13, "Dr. Felix", "Urologia"));
    hospital.registrarMedico(new Medico(14, "Dra. Natalia", "Oncologia"));
    
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

                    hospital.mostrarCitas();

                    int op = Input.nextInt("Seleccione cita a atender: ");

                    hospital.eliminarCita(op - 1);

                    System.out.println("Paciente atendido y cita eliminada");

                    break;

                
                case '6':
                    System.out.println("Saliend1o del sistema");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        } while (sel != '5');
    
    
    }
}
