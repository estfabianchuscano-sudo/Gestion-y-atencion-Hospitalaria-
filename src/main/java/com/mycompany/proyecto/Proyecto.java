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
                    System.out.println("Asignar cita");
                    
                    String docCita = Input.next("Documento del paciente: ");
                    Paciente pac = hospital.buscarPaciente(docCita);

                    if (pac != null) {
                    String hora = Input.next("Hora: ");

                    System.out.println("Lista de médicos:");
                    hospital.mostrarMedicos();

                    int opcionMedico = Input.nextInt("Seleccione medico (posición): ");
                    Medico m = hospital.getMedicos().get(opcionMedico);

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
                    System.out.println("Cantidad de pacientes: " + hospital.cantidadPacientes());
                    break;
  
                case '5':
                    System.out.println("Atendiendo paciente");
                    break;

                
                case '6':
                    System.out.println("Saliendo del sistema");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        } while (sel != '5');
    
    
    }
}
