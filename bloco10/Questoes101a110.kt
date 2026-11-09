fun questao101(num: Double) {
    if (num > 20.0 && num < 90.0) println("o número está na faixa de 20 a 90, exclusive")
    else println("o número está fora da faixa de 20 a 90")
}

fun questao102(numero: Double) {
    if (numero > 20.0) println("maior que 20")
    else if (numero < 20.0) println("menor que 20")
    else println("igual a 20")
}

fun questao103(anoa: Int, anon: Int) {
    if (anon > anoa) println("Ano de Nascimento Invalido")
    else println("Idade: ${anoa - anon}")
}

fun questao104(nome: String, sexo: String, idade: Int) {
    if (sexo.equals("F", ignoreCase = true) && idade < 25) println("$nome ACEITA")
    else println("$nome NAO ACEITA")
}

fun questao105(sigla: String) {
    when (sigla.uppercase()) {
        "RJ" -> println("carioca")
        "SP" -> println("paulista")
        "MG" -> println("mineiro")
        else -> println("outros estados")
    }
}

fun questao106(nome: String) {
    val letra = nome.firstOrNull()?.toString() ?: ""
    if (letra.equals("A", ignoreCase = true)) println(nome)
}

fun questao107(nome: String) {
    if (nome.startsWith("JOSÉ ") || nome == "JOSÉ") println(nome)
}

fun questao108(nome: String) {
    val lower = nome.lowercase()
    if (lower.startsWith("josé ") || lower == "josé" || lower.startsWith("jose ") || lower == "jose") println(nome)
}

fun questao109(nome1: String, nome2: String) {
    if (nome1.compareTo(nome2) < 0) println("$nome1 $nome2") else println("$nome2 $nome1")
}

fun questao110(a: Double, b: Double) {
    if (a == b) println("iguais") else println("diferentes")
}
