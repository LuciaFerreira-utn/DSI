package domain.tp;

import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InscripcionTests {

    Materia aM1;
    Materia fisica1;
    Materia algoritmos;
    Materia matDiscreta;
    Materia sistemasYorg;
    Materia algebra;
    Materia analisisSistemas;
    Materia aM2;
    Materia legislacion;
    Materia ingenieriaYsociedad;
    Alumno pepe;
    Inscripcion unaInscripcion;
    Inscripcion otraInscripcion;
    Inscripcion inscripcion2;

    @Test
    public void inscripcionValida() { // da true

        aM1 = new Materia("Analisis matematico", new HashSet<>());
        fisica1 = new Materia("Fisica1", new HashSet<>()); // tiene que dar true
        algoritmos = new Materia("Algoritmos", new HashSet<>());
        matDiscreta = new Materia("Matematica Discreta", new HashSet<>());
        sistemasYorg = new Materia("Sistemas y Organizaciones", new HashSet<>());
        algebra= new Materia("Algebra", new HashSet<>());
        ingenieriaYsociedad=new Materia("Ingenieria y sociedad", new HashSet<>());
        legislacion=new Materia("Legislacion", Set.of(ingenieriaYsociedad));

        Set<Materia> correlativasA = Set.of(algoritmos, matDiscreta, sistemasYorg);

        analisisSistemas = new Materia("Analisis sistemas", correlativasA); // Tiene que dar true, hacer otro
        aM2 = new Materia("Analisis matematico 2", Set.of(aM1)); // Tiene que dar false

        Set<Materia> materiasAprobadas = Set.of(algoritmos,matDiscreta,sistemasYorg,algebra);

        pepe= new Alumno("Pedro", "Carlo",2089624,materiasAprobadas);

        Set<Materia> materiasInscribir = Set.of(analisisSistemas,fisica1,aM1);// tiene que dar true

        unaInscripcion = new Inscripcion(pepe, materiasInscribir);

        Assertions.assertTrue(unaInscripcion.aprobada());


    }

    @Test
    public void inscripcionInvalida(){ // da false porque no tiene am1 para am2
        Set<Materia> materiasInscribirB = Set.of(analisisSistemas,fisica1,aM2); // tiene que dar false
        otraInscripcion = new Inscripcion(pepe, materiasInscribirB);
        Assertions.assertTrue(otraInscripcion.aprobada());
    }

    @Test
    public void inscripcionSimple(){ //tiene que dar true
        Set<Materia> materiasInscribirC = Set.of(aM1,fisica1,ingenieriaYsociedad);
        inscripcion2 = new Inscripcion(pepe,materiasInscribirC);
        Assertions.assertTrue(inscripcion2.aprobada());
    }
}
