package domain.tp;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;
@Getter
@Setter


public class Materia{
    private String nombreMateria;
    private Set<Materia> correlativas;

    public Materia(String nombreMateria, Set<Materia> correlativas) {
        this.nombreMateria = nombreMateria;
        this.correlativas = correlativas;
    }

    public boolean validadorCorrelativas(Alumno alumno){
        return this.correlativas.stream().allMatch(materia -> alumno.aprobada(materia) );// Dejo el this porque es atributo de mi clase
    }
}
