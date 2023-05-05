package com.example.androidmaster

fun main (){
    getMonth(1)
    println(getLette(2,"Santiago"))
    getTrimester(7)
    resultado(15)
    resultado("String")
    resultado(true)
    println(getSemester1(2))
    println(getSemester2(7))

}

fun getMonth(month:Int){
    when(month){
        1->println("Enero")
        2->println("Febrero")
        3->println("Marzo")
        4->println("Abril")
        5->println("Mayo")
        6->println("Junio")
        7->println("Julio")
        8->println("Agosto")
        9->println("Septiembre")
        10->println("Octubre")
        11->println("Nopviembre")
        12->println("Diciembre")
        else -> println("Valor Incorrecto")
    }
}

fun getLette(inde:Int, word:String):Char{
    return word[inde]
}
//se ingresan rangos con in valor .. segundo valor
fun getTrimester (month:Int){
    when(month){
        1, 2, 3->println("Primer Trimestre")
        4, 5, 6->println("Segundo Trimestre")
        7, 8, 9->println("Tercer Trimestre")
        in 10..12->println("Cuarto Trimestre")
        else->println("Valor Invalido")
    }
}

fun getSemester1 (month:Int):String {
    val result = when(month){
        in 1..6->"Primer Semestre"
        in 7..12->"Segundo Semestre"
        else->"Valor Invalido"
    }
    return result
}
//Código abreviado
fun getSemester2 (month:Int) = when (month) {
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        else -> "Valor Invalido"
    }

fun resultado(value:Any){
    when(value){
        is Int-> println(value + value)
        is String -> println(value)
        is Boolean -> if(value) println("True")
    }
}