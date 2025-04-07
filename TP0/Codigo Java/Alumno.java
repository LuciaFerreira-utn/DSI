package domain.tp;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;
@Getter
@Setter

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer legajo, Set<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean aprobada(Materia materia){
        return materiasAprobadas.contains(materia);
    }

}
