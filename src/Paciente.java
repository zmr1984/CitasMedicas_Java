public class Paciente {

    private String id;
    private String nombre;
    private String telefono;
    private int edad;

    public Paciente(String id,
                    String nombre,
                    String telefono,
                    int edad) {

        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {

        return id + "," +
                nombre + "," +
                telefono + "," +
                edad;
    }
}