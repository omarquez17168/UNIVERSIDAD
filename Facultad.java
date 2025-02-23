import java.util.ArrayList;
import java.util.List;
public class Facultad {
    private int codigo;
    private String nombre;
    private List<Profesor> profesores;
    private List<Carrera> carreras;

    public Facultad(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public List<Profesor> getProfesores() { return profesores; }
    public List<Carrera> getCarreras() { return carreras; }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}