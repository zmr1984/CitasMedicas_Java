import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class ArchivoCSV {

    private static final String CARPETA_DB = "db";

    private static final String PACIENTES =
            CARPETA_DB + "/pacientes.csv";

    private static final String DOCTORES =
            CARPETA_DB + "/doctores.csv";

    private static final String CITAS =
            CARPETA_DB + "/citas.csv";

    public static void inicializarArchivos() {

        try {

            File carpeta = new File(CARPETA_DB);

            if (!carpeta.exists()) {

                carpeta.mkdir();

                System.out.println(
                        "Carpeta db creada correctamente."
                );
            }

            crearArchivo(PACIENTES);

            crearArchivo(DOCTORES);

            crearArchivo(CITAS);

        } catch (IOException e) {

            System.out.println(
                    "Error al crear archivos: "
                            + e.getMessage()
            );
        }
    }

    private static void crearArchivo(String ruta)
            throws IOException {

        File archivo = new File(ruta);

        if (!archivo.exists()) {

            archivo.createNewFile();

            System.out.println(
                    "Archivo creado: "
                            + archivo.getName()
            );
        }
    }

    public static void guardarPaciente(Paciente paciente) {

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(PACIENTES, true))) {

            writer.write(paciente.toString());

            writer.newLine();

            System.out.println(
                    "Paciente guardado correctamente."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error al guardar paciente: "
                            + e.getMessage()
            );
        }
    }

    public static void guardarDoctor(Doctor doctor) {

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(DOCTORES, true))) {

            writer.write(doctor.toString());

            writer.newLine();

            System.out.println(
                    "Doctor guardado correctamente."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error al guardar doctor: "
                            + e.getMessage()
            );
        }
    }

    public static void guardarCita(Cita cita) {

        try (BufferedWriter writer =
                     new BufferedWriter(
                             new FileWriter(CITAS, true))) {

            writer.write(cita.toString());

            writer.newLine();

            System.out.println(
                    "Cita guardada correctamente."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error al guardar cita: "
                            + e.getMessage()
            );
        }
    }

    public static void mostrarPacientes() {

        System.out.println("\n===== PACIENTES =====");

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(PACIENTES))) {

            String linea;

            while ((linea = reader.readLine()) != null) {

                String[] datos = linea.split(",");

                System.out.println("\nID: " + datos[0]);
                System.out.println("Nombre: " + datos[1]);
                System.out.println("Edad: " + datos[2]);
                System.out.println("Teléfono: " + datos[3]);
                System.out.println("----------------------------------");
            }

        } catch (IOException e) {

            System.out.println(
                    "Error al leer pacientes: "
                            + e.getMessage()
            );
        }
    }

    public static void mostrarDoctores() {

        System.out.println("\n===== DOCTORES =====");

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(DOCTORES))) {

            String linea;

            while ((linea = reader.readLine()) != null) {

                String[] datos = linea.split(",");

                System.out.println("\nID Doctor: " + datos[0]);
                System.out.println("Nombre: " + datos[1]);
                System.out.println("Especialidad: " + datos[2]);
                System.out.println("----------------------------------");
            }

        } catch (IOException e) {

            System.out.println(
                    "Error al leer doctores: "
                            + e.getMessage()
            );
        }
    }

    public static void mostrarCitas() {

        System.out.println("\n===== CITAS =====");

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(CITAS))) {

            String linea;

            while ((linea = reader.readLine()) != null) {

                String[] datos = linea.split(",");

                System.out.println("\nFolio: " + datos[0]);
                System.out.println("Paciente: " + datos[1]);
                System.out.println("Doctor: " + datos[2]);
                System.out.println("Fecha: " + datos[3]);
                System.out.println("Hora: " + datos[4]);
                System.out.println("----------------------------------");
            }

        } catch (IOException e) {

            System.out.println(
                    "Error al leer citas: "
                            + e.getMessage()
            );
        }
    }
}