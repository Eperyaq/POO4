import java.lang.IllegalArgumentException

fun main() {
    //No entiendo que pasa
    try {

        val buenCoche = Coche("rojo", "seat", "leon", 250, 4, "1233ABC")
        println(buenCoche)
        /*
        val miCoche = Coche ("azul","toyota","corolla", 20, 1, "1234hhh")
        println(miCoche)


        val tuCoche = Coche("amarillo", "", "Leon", 30, 4, "1234ABC")
        println(tuCoche)

         */
    }
    catch (e: IllegalArgumentException){
        println(e.message)
    }

}