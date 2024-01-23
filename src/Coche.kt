import java.lang.IllegalArgumentException

//Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como el método toString()
class Coche(
    var color: String,
    marca: String?,
    modelo:String?,
    numCaballos:Int,
    numPuertas:Int,
    matricula: String
) {

    val marca: String? = marca?.capitalize()
    val modelo:String? = modelo?.capitalize()
    val matricula: String
    val numCaballos: Int
    val numPuertas: Int


    init {
        require(marca.isNullOrBlank()){"La marca no puede ser ni nula ni estar vacio"}
        require(modelo.isNullOrBlank()){"El modelo no puede ser ni nulo ni estar vacio"}
        require(matricula.length == 7){"La matricula no puede tener menos de 7 caracteres"}
        require(numCaballos <70 || numCaballos > 700){"Los caballos no pueden ser inferior a 70 ni superior a 700"}
        require(numPuertas < 3|| numPuertas > 5){"No puedes tener ni menos de 3 puertas ni mas de 5"}


        this.matricula = matricula
        this.numCaballos = numCaballos
        this.numPuertas = numPuertas
    }




    override fun toString(): String {
        return "Coche(color=$color, marca=$marca, modelo=$modelo, numCaballos=$numCaballos, numPuertas=$numPuertas, matricula=$matricula)"
    }
}
