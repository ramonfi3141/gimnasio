public class Socio {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String email;
    private Date fechaNacimiento;
    private int numeroSocio;

    public Socio(String nombre, String apellido, String telefono, String direccion, String email, Date fechaNacimiento, int numeroSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroSocio = numeroSocio;
    }

    public void registrar() {
        // Implementaci�n del m�todo para registrar un socio
    }

    public void actualizarDatos() {
        // Implementaci�n del m�todo para actualizar los datos de un socio
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Tel�fono: " + telefono + ", Direcci�n: " + direccion + ", Email: " + email;
    }
}
