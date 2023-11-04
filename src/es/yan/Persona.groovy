package es.yan

abstract class Persona{
    String nombre
    String apellidos

    Persona(String nombre, String apellidos){
        this.nombre = nombre
        this.apellidos = apellidos
    }

    void imprimirNombreRojo(){
        echo "\033[31m${nombre}\033[0m"
    }

    def abstract printInstanceOf()
}