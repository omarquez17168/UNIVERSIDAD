import java.util.ArrayList;
import java.util.List;
public class Universidad {
    private String nombre;
    private String rector;
    private String ciudad;
    private List<Facultad> facultades;

    public Universidad(String nombre, String rector, String ciudad) {
        this.nombre = nombre;
        this.rector = rector;
        this.ciudad = ciudad;
        this.facultades = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getRector() { return rector; }
    public String getCiudad() { return ciudad; }
    public List<Facultad> getFacultades() { return facultades; }

    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }
}