enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val id: Int, val name: String)

data class ConteudoEducacional(var nome: String)

data class Formacao(val nome: String) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
    }
}    
val usuario = Usuario(19, "João")

fun main() {
    println("diga a sua idade para iniciarmos sua incrição.  ")
    println(usuario.id)
    println("agora fale seu nome.")
    println(usuario.name)
}
