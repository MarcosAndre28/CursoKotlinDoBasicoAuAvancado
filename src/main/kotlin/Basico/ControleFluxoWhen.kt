package Basico

fun main() {


    /*println("Escolha uma oção de 1 a 3")
    var opcao: Int = readLine()!!.toString().toInt()

    when(opcao){
        1 -> println("Opção 1")
        2 -> println("Opção 2")
        3 -> println("Opção 3")
    }*/

    /*
when( opcao ){
  1,2 -> {
          println("Café puro")
          println("Leite separado")
      }
      3 -> println("Chocolate quente")
      else -> {
          println("Nenhuma opção selecionada")
          println("Selecione uma opção!!")
      }
  }
  */

    var opcao = 1
    var resultado = when( opcao ){
        1 -> "Café puro"
        2 -> "Chocolate quente"
        else -> "Nenhuma opção selecionada"
    }
    println( resultado )

}