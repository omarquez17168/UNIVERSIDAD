import java.time.LocalDate;

public class Persona {
    private String cedula;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String lugarNacimiento;

    public Persona(String cedula, String nombre, LocalDate fechaNacimiento, String lugarNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getLugarNacimiento() { return lugarNacimiento; }
}