package com.example.androidmaster

fun main(){
 exercise1(100)
 exercise1(102)
 exercise1(200)
 exercise1(49)
 exercise1(0
 )
}

fun exercise1(notifications:Int){
// when (notifications) {
//  in 1..100 -> println("Tiene " + notifications.toString())
//  101-> println("Tiene 99+ notificaciones")
//  0 -> println("Sin notificaciones")
//  else -> println("ERROR")

 if (notifications<=100){
    println("Tiene "+ notifications.toString() + " notificaciones")}
   else if ( notifications>100 ){println("Tiene 99+ notificaciones")}
    else {println("Sin notificaciones")
 }

 if (notifications<=100){
  println("Tiene $notifications notificaciones")}
 else if ( notifications>100 ){println("Tiene 99+ notificaciones")}
 else {println("Sin notificaciones")
 }



}