package Basico

class Casa(s: String, i: Int) {

    //Propriedades
    var cor: String = ""

    //Métodos
    fun abrirJanela(qtdJanelas: Int){
        println("Abrir janela total: $qtdJanelas ")
    }

    fun abrirPorta(){
        println("Abrir porta")
    }

    fun abrirCasa(){
        //this.abrirJanela()
        this.abrirPorta()
    }

}
fun main(args: Array<String>) {


    val casa = Casa("Amarela", 2)
    casa.cor = "Amarela"
    casa.abrirJanela( 10 )

    val casa2 = Casa("Amarela", 2)
    casa2.cor = "Vermelha"


    println(casa.cor)
    println(casa2.cor)


}