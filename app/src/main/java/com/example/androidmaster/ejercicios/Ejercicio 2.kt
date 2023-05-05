package com.example.androidmaster.ejercicios

fun main(){
    println("el valor de su ticket es de:  \$${ticketValue(true, 13)}.")
    println("el valor de su ticket es de:  \$${ticketValue(false, 52)}.")
    println("el valor de su ticket es de:  \$${ticketValue(true, 52)}.")
    println("el valor de su ticket es de:  \$${ticketValue(false, 61)}.")
    println("el valor de su ticket es de:  \$${ticketValue(true, 61)}.")
    println("el valor de su ticket es de:  \$${ticketValue(true, 105)}.")

}

fun ticketValue (ismonday:Boolean, age:Int):Int {
    /**   when (age){
    in 0..12 -> println("El valor de su entrada es de 15 USD")
    in 13..60 ->  if (ismonday){println("El valor de su entrada es de 25 USD")}
    else {println("El valor de su entrada de 30 USD")}
    in 61..100 -> println("El valor de su entrada es de 20 USD")
    else->println("-1")
     */
    var ticketvalu: Int
    when (age) {
        in 0..12 -> ticketvalu = 15
        in 13..60 -> if (ismonday) {
            ticketvalu = 25
        } else {
            ticketvalu = 30
        }

        in 61..100 -> ticketvalu = 20
        else -> ticketvalu = -1
    }
        return ticketvalu
    }

fun ticketprice(age:Int, ismonday:Boolean):Int{
    return when (age){
        in 0..12 ->15
        in 13..60 -> if(ismonday) 25 else 30
        in 61..100 -> 20
        else ->-1
    }
}


