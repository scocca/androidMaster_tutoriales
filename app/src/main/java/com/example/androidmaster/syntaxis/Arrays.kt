package com.example.androidmaster.syntaxis

fun main(){
    val weekDays= arrayOf("Lunes", "Martes", "Miercoles", "jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays[3])
    println(weekDays.size)
    val indes = (weekDays.size-1)
    val search = 5
    if (indes>=search){
        println(weekDays[search])
    }else{println("No hay mas valores")}

    //weekDays[7]="Hooola" -->Asigna un nuevo valor a la posicion indicada

    /** bucle para array **/

    for(position in weekDays.indices){
        println("He pasado por aqui "+ weekDays[position])
    }

    for ((position, value) in weekDays.withIndex()){
        println("la posicion $position, contiene $value")
    }

    for (weekday in weekDays){
        println("Ahora es $weekday")
    }

}