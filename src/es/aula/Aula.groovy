package es.aula

import es.yan.Persona

class  Aula {

    def personas

    Aula(){
        this.personas = []
    }

    def addPersona(Persona persona){
        this.personas.add(persona)
        println("Persona añadida: ${persona.nombre} ${persona.apellidos}")
    }
}