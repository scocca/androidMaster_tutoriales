package com.example.androidmaster


//variables numericas
fun main () {
    add(15, 25)
    variablesnumericas()
    println(substract(3, 2))

    //variables numericas



    //long (numeros mas largos hasta 19 digitos)
    val largo: Long = 30

    //float (soporta numeros decimales), recordar agregar la f al final
    val example: Float = 30.5f

    //double (soporta hasta 14 decimales)
    val ejemplo: Double = 13.0002

    //variasbles alfanumericas

    //Char (solo 1 caracter)
    val charejemplo: Char = 'a'

    //String (cadenas de caracteres)
    val Stringexample: String = "Santiago"


    //Variables boolean

    //boolean
    val BooleanExample: Boolean = true
    val BooleanExample2: Boolean = false

//algunas variables se pueden no declarar, el lenguaje lo reconoce de acuerdo a lo almacenado ej: true or false are always boolean,
//like a chain of text alwais will be a String


//    println(age2)
    //print ln envia la infromacion a la pantalla con un salto de linea

//    age2 = 28
//    println(age2)
//las variables val no pueden cambiar el valor declarado, las variables var si pueden cambiar su valor


    //var prueba4:Int = prueba1.toInt()
    //println(prueba4)

}

fun variablesnumericas (){
    var age2: Int
    age2 = 23
//int (numeros hasta 10 digitos)
    val age: Int = 30
    println(age + age2)
    println(age)
    println(age2)
    var prueba1:String = "Hola"
    var prueba2:String = "Adios"
    println(prueba1 + "Soy Santiago " + prueba2)
    var prueba3:String = age2.toString()
    println(prueba3)
}

//funcion copn parametros de entrada
fun add(primernumero:Int, segundonumero:Int){
    println(primernumero+segundonumero)
}

fun substract(pnumero:Int, snumero:Int):Int{
    return pnumero-snumero
}

//despues del return el codigo no sigue ejecutandosé

fun substractCool(prnumero:Int, senumero:Int) = prnumero - senumero
//forma simplificada para funciones simples

