import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

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
}