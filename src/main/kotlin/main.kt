
//funções
fun rankearVitorias(vitorias: Int?, derrotas: Int?): Int {
    if (vitorias != null && derrotas != null) {
        return vitorias - derrotas
    }
    return 0
}

fun classificarNivel(resultado: Int): String{
    return when {
        resultado <= 10 -> "FERRO"
        resultado <= 20 -> "BRONZE"
        resultado <= 50 -> "PRATA"
        resultado <= 80 -> "OURO"
        resultado <= 90 -> "DIAMANTE"
        resultado <= 100 -> "LENDÁRIO"
        else -> "IMORTAL"
    }

}

//Programa principal
fun main() {
    println()
    println("Partidas Rankeadas")
    println()

    println("Digite a quantidade de VITÓRIAS do Herói: ")
    val inputVitorias = readlnOrNull()

    println("Digite a quantidade de DERROTAS do Herói: ")
    val inputDerrotas = readlnOrNull()

    val vitorias = inputVitorias?.toInt()
    val derrotas = inputDerrotas?.toInt()


    val resultado = rankearVitorias(vitorias, derrotas)

    val classifificacao = classificarNivel(resultado)

    println("O heroi tem o total de $resultado vitória e por isso esta no nível $classifificacao")
}

