package com.example.androidmaster

fun main(){



}

fun ifbasico(){
    val name = "Santiago"
    if(name.lowercase() == "santiago"){
        println("true")}else{
    println("Codigoejecutado")
    }
    }

fun ifAnidado(){
    val animal:String ="Gallina"
    if(animal == "Dog"){
        println("Es un perrito")
    }else if (animal == "Gato") {
        println("es un gato")
    }else {
        println("No se que animal es")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean = false
    soyFeliz = !soyFeliz

    if(soyFeliz==true){
        println("Esta usted deprimido?")
    }else{
        println("Que bueno que seas feliz")
    }
}

fun ifInt(){
    var age = 18
    if(age>=18){
        println("Puedes beber Alcohol")
    }else{
        println("No puedes beber alcohol")
    }
}

fun ifMultiple(){
    var age = 19
    var permiso = false

    if(age >= 18 && permiso){
        println("Puedes servirte alcohol")
    }else{
        println("larguese del bar, no cumples los requisitos")
    }

}