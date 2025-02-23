import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Estudiante extends Persona {
    private String colegio;
    private LocalDate fechaIngreso;
    private List<Carrera> carreras;
    private List<Curso> cursos;

    public Estudiante(String cedula, String nombre, LocalDate fechaNacimiento, String lugarNacimiento, 
                      String colegio, LocalDate fechaIngreso) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.colegio = colegio;
        this.fechaIngreso = fechaIngreso;
        this.carreras = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public String getColegio() { return colegio; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public List<Carrera> getCarreras() { return carreras; }
    public List<Curso> getCursos() { return cursos; }

    public void inscribirCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public void inscribirCurso(Curso curso) {
        cursos.add(curso);
    }
}