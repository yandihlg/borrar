package es.yan

import es.yan.Persona

class Profesor extends Persona{
    def asignatura;
    def curso;

    Profesor(String nombre, String apellidos, String asignatura, int curso){
        super(nombre, apellidos);
        this.asignatura = asignatura;
        this.curso = curso;
    }

    def printInstanceOf(){
        return "Profesor"
    }

}