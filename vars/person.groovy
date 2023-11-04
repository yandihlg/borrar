import es.yan.Person
import es.aula.Aula

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
    aula.addPersona(new Profesor('Juan', 'Perez', 'Matematicas', '1'))
    aula.addPersona(new Estudiante('Pedro', 'Garcia', 'Informatica', '2'))
    return aula
}

def printInstanceOf(Person person){
    println(person.printInstanceOf())
}

def printAula(Aula aula){
    aula.personas.each { person ->
        println(person.printInstanceOf())
    }
}