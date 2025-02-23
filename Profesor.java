import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private String profesion;
    private String nacionalidad;
    private double sueldo;
    private Facultad facultad;
    private List<Curso> cursos;

    public Profesor(String cedula, String nombre, LocalDate fechaNacimiento, String lugarNacimiento, 
                    String profesion, String nacionalidad, double sueldo, Facultad facultad) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.profesion = profesion;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.facultad = facultad;
        this.cursos = new ArrayList<>();
    }

    public String getProfesion() { return profesion; }
    public String getNacionalidad() { return nacionalidad; }
    public double getSueldo() { return sueldo; }
    public Facultad getFacultad() { return facultad; }
    public List<Curso> getCursos() { return cursos; }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }
}