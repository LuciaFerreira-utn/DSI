# Aclaraciones
- Si bien el enunciado y mi resolución se centra en un validador de correlativas, se podria haber implementado el sistema de inscripcion completa, donde se podrian agregar las inscripciones exitosas al alumno y se rechazaria en caso de que se quiera inscribir a una materia que ya aprobó.
- En el diagrama de clases tuve varias dudas en si debia agregar la relacion de agregacion, sin embargo opte por la relacion simple para expresar que se usaban muchas instancias de alguna clase.
- Como expresé en el diagrama, materias tenia una "relacion" con su misma clase por el conjunto de correlativas que tenia cada materia, esto no supe como plasmarlo en el trabajo.
- Agregué atributos a Alumno y Materia para facilitar la comprensión en los tests y darle un poco más de forma a las clases.
- Podria crear un caso en donde la inscripcion sea nula, y en tal caso retornar una excepción.
