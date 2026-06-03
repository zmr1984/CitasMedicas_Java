public class Cita {

    private String folio;
    private String pacienteId;
    private String doctorId;
    private String fecha;
    private String hora;

    public Cita(String folio,
                String pacienteId,
                String doctorId,
                String fecha,
                String hora) {

        this.folio = folio;
        this.pacienteId = pacienteId;
        this.doctorId = doctorId;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFolio() {
        return folio;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {

        return folio + "," +
                pacienteId + "," +
                doctorId + "," +
                fecha + "," +
                hora;
    }
}