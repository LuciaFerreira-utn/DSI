class Inscripcion{

    var property materiasAInscribir= #{}
    var property alumno

    method aprobada() = materiasAInscribir.all({materia => materia.validadorCorrelativas(alumno)})


}

class Materia{
    const property nombreMateria 
    const property correlativas= #{} // puede ser un var tambien

    method validadorCorrelativas(alumno) = correlativas.all({materia=>alumno.aprobada(materia)})

}

class Alumno{
    const property nombre 
    const property apellido 
    const property legajo    
    var property materiasAprobadas = #{}

    method aprobada(materia) = materiasAprobadas.contains(materia)  // aprovecho el uso de polimorfismo

}
