package domain.tp;

import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InscripcionTests {

    Materia aM1=new Materia("Analisis matematico", new HashSet<>());
    Materia fisica1=new Materia("Fisica1", new HashSet<>());
    Materia algoritmos=new Materia("Algoritmos", new HashSet<>());
    Materia matDiscreta=new Materia("Matematica Discreta", new HashSet<>());
    Materia sistemasYorg=new Materia("Sistemas y Organizaciones", new HashSet<>());
    Materia algebra=new Materia("Algebra", new HashSet<>());;

    Set<Materia> correlativasA = Set.of(algoritmos, matDiscreta, sistemasYorg);

    Materia analisisSistemas=new Materia("Analisis sistemas", correlativasA);
    Materia aM2=new Materia("Analisis matematico 2", Set.of(aM1));
    Materia ingenieriaYsociedad= new Materia("Ingenieria y sociedad", new HashSet<>());
    Materia legislacion=new Materia("Legislacion", Set.of(ingenieriaYsociedad));

    Set<Materia> materiasAprobadas = Set.of(algoritmos,matDiscreta,sistemasYorg,algebra);
    Alumno pepe= new Alumno("Pedro", "Carlo",2089624,materiasAprobadas);
    Inscripcion unaInscripcion;
    Inscripcion otraInscripcion;
    Inscripcion inscripcion2;


    @Test
    public void inscripcionValida() { // da true

        Set<Materia> materiasInscribir = Set.of(analisisSistemas,fisica1,aM1);// tiene que dar true
        unaInscripcion = new Inscripcion(pepe, materiasInscribir);

        Assertions.assertTrue(unaInscripcion.aprobada());
    }

    @Test
    public void inscripcionInvalida(){ // da false porque no tiene am1 para am2
        Set<Materia> materiasInscribirB = Set.of(analisisSistemas,fisica1,aM2); // tiene que dar false
        otraInscripcion = new Inscripcion(pepe, materiasInscribirB);
        Assertions.assertFalse(otraInscripcion.aprobada());
    }

    @Test
    public void inscripcionSimple(){ //tiene que dar true
        Set<Materia> materiasInscribirC = Set.of(aM1,fisica1,ingenieriaYsociedad);
        inscripcion2 = new Inscripcion(pepe,materiasInscribirC);
        Assertions.assertTrue(inscripcion2.aprobada());
    }
}
