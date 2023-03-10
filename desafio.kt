// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { INICIANTE, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, var nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        for (u in usuarios) {
            inscritos.add(u)
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
 	val conteudoEducacional1 = ConteudoEducacional("Kotlin Iniciante", 50, Nivel.INICIANTE)
    val conteudoEducacional2 = ConteudoEducacional("Kotlin Intermediario", 60, Nivel.INTERMEDIARIO)
    val conteudoEducacional3 = ConteudoEducacional("Kotlin Avancado", 70, Nivel.AVANCADO)
    
    //println(conteudoEducacional1)
    //println(conteudoEducacional2)
    //println(conteudoEducacional3)
    
 	val conteudos = mutableListOf<ConteudoEducacional>()
    conteudos.add(conteudoEducacional1)
    conteudos.add(conteudoEducacional2)
    conteudos.add(conteudoEducacional3)
    
    //println(conteudos)
    
    val formacaoKotlin = Formacao("FORMAÇÃO KOTLIN", conteudos)
    
    //println(formacaoKotlin)
    
    var usuario1 = Usuario("Anderson", 39)
    var usuario2 = Usuario("Ana Paula", 38)
    var usuario3 = Usuario("Junior", 20)
    
    formacaoKotlin.matricular(usuario1, usuario2, usuario3)
    
    println("Formação ${formacaoKotlin.nome}")
    println()
    println("Conteúdo:")
    for(conteudo in formacaoKotlin.conteudos) println(" -> ${conteudo.nome} - nível ${conteudo.nivel} - duração de ${conteudo.duracao}h ")
    println()
    
    println("Inscritos:")
    for (inscrito in formacaoKotlin.inscritos) println(" -> "+inscrito.nome)
    //println(formacaoKotlin.inscritos)
}
