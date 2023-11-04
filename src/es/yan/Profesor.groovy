package es.yan

import es.yan.Person

class Profesor extends Person{
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