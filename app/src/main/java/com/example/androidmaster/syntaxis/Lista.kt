package com.example.androidmaster.syntaxis

fun main() {
    /**
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())
    //Filtrado de listas
    val example =readOnly.filter { it.contains("r") }
    println(example)
    println ("Salto de linea")
    readOnly.forEach { weekDay -> println(weekDay) }
    println("Salto de linea")
     */
    mutableList()
}

fun mutableList() {
    var weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "jueves", "Viernes", "Sabado", "Domingo")
    println("Muestro lista completa**")
    println(weekDays)

    weekDays.add("8vo dia")
    weekDays.add(0, "9no dia")
    println(weekDays)
    println("Imprimo con nuevos dias")

    if (weekDays.isEmpty()) {
    } else {
        weekDays.forEach {
            println(it)
        }

        if (weekDays.isNotEmpty()) {
            weekDays.forEach { println(it) }
        }
        weekDays.last()


    }
}