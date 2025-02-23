import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int creditosTotales;
    private int semestres;
    private NivelCarrera nivel;
    private Facultad facultad;
    private List<Curso> cursos;
    private List<Estudiante> estudiantes;

    public Carrera(String nombre, int creditosTotales, int semestres, NivelCarrera nivel, Facultad facultad) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.semestres = semestres;
        this.nivel = nivel;
        this.facultad = facultad;
        this.cursos = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public int getCreditosTotales() { return creditosTotales; }
    public int getSemestres() { return semestres; }
    public NivelCarrera getNivel() { return nivel; }
    public Facultad geFacultad() { return facultad;}
    public List<Curso> getCursos() { return cursos; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}