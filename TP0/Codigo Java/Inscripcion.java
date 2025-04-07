package domain.tp;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Inscripcion{
    private Alumno alumno;
    private Set<Materia> materias;

    public Inscripcion(Alumno alumno,Set<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada(){
        return this.materias.stream().allMatch(materia -> materia.validadorCorrelativas(alumno));
    }
}
