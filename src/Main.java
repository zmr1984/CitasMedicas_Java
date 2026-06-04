import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArchivoCSV.inicializarArchivos();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n==================================");
            System.out.println(" SISTEMA DE CITAS MÉDICAS");
            System.out.println("==================================");

            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar doctor");
            System.out.println("3. Crear cita");
            System.out.println("4. Ver pacientes");
            System.out.println("5. Ver doctores");
            System.out.println("6. Ver citas");
            System.out.println("7. Salir");

            System.out.print("\nSeleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    scanner.nextLine();

                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    Paciente paciente =
                            new Paciente(
                                    id,
                                    nombre,
                                    edad,
                                    telefono
                            );

                    ArchivoCSV.guardarPaciente(
                            paciente
                    );

                    break;

                case 2:

                    scanner.nextLine();

                    System.out.print("ID Doctor: ");
                    String idDoctor = scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombreDoctor = scanner.nextLine();

                    System.out.print("Especialidad: ");
                    String especialidad = scanner.nextLine();

                    Doctor doctor =
                            new Doctor(
                                    idDoctor,
                                    nombreDoctor,
                                    especialidad
                            );

                    ArchivoCSV.guardarDoctor(
                            doctor
                    );

                    break;

                case 3:

                    scanner.nextLine();

                    System.out.print("Folio de cita: ");
                    String folio = scanner.nextLine();

                    System.out.print("ID Paciente: ");
                    String pacienteId = scanner.nextLine();

                    System.out.print("ID Doctor: ");
                    String doctorIdCita = scanner.nextLine();

                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = scanner.nextLine();

                    System.out.print("Hora (hh:mm): ");
                    String hora = scanner.nextLine();

                    Cita cita =
                            new Cita(
                                    folio,
                                    pacienteId,
                                    doctorIdCita,
                                    fecha,
                                    hora
                            );

                    ArchivoCSV.guardarCita(cita);

                    break;

                case 4:

                    ArchivoCSV.mostrarPacientes();

                    break;

                case 5:

                    ArchivoCSV.mostrarDoctores();

                    break;

                case 6:

                    ArchivoCSV.mostrarCitas();

                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}