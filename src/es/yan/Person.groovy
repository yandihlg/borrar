package es.yan

abstract class Person{
    String nombre
    String appelidos

    void imprimirNombreRojo(){
        echo "\033[31m${nombre}\033[0m"
    }

    def abstract printInstanceOf()
}