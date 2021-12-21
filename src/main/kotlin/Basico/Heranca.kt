package Basico

open class Animal() {
    open fun dormir() {
        println("Dormir")
    }

    fun Corer() {
        println("Correr")
    }
}

class Cao : Animal() {
    override fun dormir() {
        super.dormir()
        println("como um cão")
    }
    fun latir(){
        println("Latir")
    }
}

class Passaro : Animal() {

}

fun main() {
    val cao = Cao()
    cao.dormir()
    cao.Corer()
    cao.latir()
    val passaro = Passaro()
    passaro.dormir()
    passaro.Corer()


}