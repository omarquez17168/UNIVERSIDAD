import java.util.ArrayList;
import java.util.List;
public class Curso {
    private int codigo;
    private String nombre;
    private int creditos;
    private int salon;
    private String edificio;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Curso(int codigo, String nombre, int creditos, int salon, String edificio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.salon = salon;
        this.edificio = edificio;
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public int getSalon() { return salon; }
    public String getEdificio() { return edificio; }
    public List<Profesor> getProfesores() { return profesores; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }

    public void asignarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}