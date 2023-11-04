package es.yan

import es.yan.Persona

class Estudiante extends Persona{
    def carrera;
    def cursoEscolar

    Estudiante(String nombre, String apellidos, String carrera, int cursoEscolar){
        super(nombre, apellidos);
        this.carrera = carrera;
        this.cursoEscolar = cursoEscolar;
    }

    def printInstanceOf(){
        return "Estudiante"
    }
}