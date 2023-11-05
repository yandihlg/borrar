import es.yan.Persona
import es.aula.Aula
import es.yan.Profesor
import es.yan.Estudiante

// def crearPerson(String nombre, String apellidos) {
//   def returnValue = new Person(nombre: nombre, apellidos: apellidos)
//   return returnValue
// }

def printName(){
    println('name')
}

def printSecondName(){
    println('second name')
}

def crearAula(){
    def aula = new Aula()
    aula.addPersona(new Profesor('Juan', 'Perez', 'Matematicas', 1))
    aula.addPersona(new Estudiante('Pedro', 'Garcia', 'Informatica', 2))
    println(aula)
    return aula
}

def printInstanceOf(Persona person){
    println(person.printInstanceOf())
}

def printAula(){
    def aula=crearAula()
    aula.personas.each { person ->
        println(person.printInstanceOf())
    }
}