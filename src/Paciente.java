public class Paciente {

    private String id;
    private String nombre;
    private int edad;
    private String telefono;

    public Paciente(String id,
                    String nombre,
                    int edad,
                    String telefono) {

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {

        return id + "," +
                nombre + "," +
                edad + "," +
                telefono;
    }
}