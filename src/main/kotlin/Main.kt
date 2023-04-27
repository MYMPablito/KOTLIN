
//Defino una constante, NO se puede cambiar

const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")

    var dinero : Int = 10 //Esta variable se puede modificar, variable de "lectura y escritura".
    println(dinero)
    dinero = 5
    println(dinero)

    val nombre = "Pablo" //Esta variable es de "solo lectura" y Kotlin no deja reasignarle un valor.
    println(nombre)

    println(PI)

    // TIPOS DE VARIABLE

    val boolean = true
    val numeroLargo : Long = 30000000000000000 // ó 3L
    val double : Double = 2.7182
    val  float : Float = 2.7182F
    val nombre2 : String = "Natasha"
    val apellido : String = " Flores"
    println("Hola, un gusto, yo soy "+ nombre2 + apellido)


}