package es.yan

class Person{
    String nombre
    String appelidos

    void imprimirNombreRojo(){
        echo "\033[31m${nombre}\033[0m"
    }
}