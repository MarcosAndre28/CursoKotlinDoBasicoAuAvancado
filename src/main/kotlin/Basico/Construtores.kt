package Basico

class Casa2( var cor: String, var vagasGaragem: Int ) {


    //Métodos
    fun detalhesCasa(){
        println("A casa tem a cor: $cor, vagas: $vagasGaragem ")
    }

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

    val casa = Casa2("Amarela", 2)

    casa.detalhesCasa()

}
