package Basico

fun exibirMensagem( nome: String, idade: Int ){
    //Bloco de códigos
    println("Alerta, você não preencheu todos os dados! nome: $nome idade: $idade ")
}
fun somar(numero1: Int, numero2: Int) : Int {

    val total = numero1 + numero2
    return total
    //println( total )

}
fun main(args: Array<String>) {

    //exibirMensagem("Jamilton", 28)
    var resultado = somar(10,5)
    println( resultado )

}