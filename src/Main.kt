import java.lang.IllegalArgumentException

fun main() {

    try {

        val coche1 = Coche("rojo", "seat", "leon", 250, 4, "1233ABC")
        println(coche1)

        // val coche2 = Coche ("azul","toyota","corolla", 20, 3, "1234hhh") Intentamos instanciar un coche con valores que no entren en los requerimientos
        //println(coche2)


        //val coche3 = Coche("amarillo", "", "Leon", 30, 4, "1234ABC") aqui igual con la marca vacía
        //println(coche3)

        //val coche4 = Coche ("azul","toyota","corolla", 100, 1, "1234hhh") Lo mismo con las puertas

        //val coche5 = Coche ("azul","toyota","corolla", 20, 1, "123hh") Lo mismo con la matricula

        //val coche5 = Coche ("toyota","corolla") Aqui igual con los parametros en nulos o vacios

    }
    catch (e: IllegalArgumentException){
        println(e.message)
    }

}