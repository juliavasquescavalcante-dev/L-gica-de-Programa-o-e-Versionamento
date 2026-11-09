import kotlin.math.*

fun questao81(conta: Int) {
    val d1 = conta / 100
    val d2 = (conta % 100) / 10
    val d3 = (conta % 100) % 10
    val inv = d3 * 100 + d2 * 10 + d1
    val soma = conta + inv
    val s1 = (soma / 100) * 1
    val s2 = ((soma % 100) / 10) * 2
    val s3 = ((soma % 100) % 10) * 3
    val digito = (s1 + s2 + s3) % 10
    println("digito verificador: $digito")
}

fun questao83(numero: Double) {
    if (numero > 0.0) {
        println("inverso: ${1.0 / numero}")
    } else {
        println("absoluto: ${abs(numero)}")
    }
}

fun questao84(a: Int) {
    if (a % 2 == 0) println("PAR") else println("IMPAR")
}

fun questao85(a: Double, b: Double, c: Double) {
    val max = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }
    println(max)
}

fun questao86(num: Double) {
    if (num > 0.0) {
        println("POSITIVO")
    } else if (num < 0.0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}

fun questao87(resp: String) {
    if (resp.equals("BRASÍLIA", ignoreCase = false) || resp.equals("Brasília", ignoreCase = false)) {
        println("PARABÉNS!")
    } else if (resp.equals("brasília", ignoreCase = true) || resp.equals("brazília", ignoreCase = true)) {
        println("CERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}

fun questao88(op: String, a: Double, b: Double) {
    when (op) {
        "+" -> println("SOMA: ${a + b}")
        "-" -> println("SUBTRACAO: ${a - b}")
        "*" -> println("MULTIPLICACAO: ${a * b}")
        "/" -> println("DIVISAO: ${a / b}")
        else -> println("OPÇAO NAO DISPONIVEL!")
    }
}

fun questao89(op: Int, pterra: Double) {
    when (op) {
        1 -> println("seu peso no planeta terra é: ${(pterra / 10.0) * 0.37}")
        2 -> println("seu peso no planeta terra é: ${(pterra / 10.0) * 0.88}")
        3 -> println("seu peso no planeta terra é: ${(pterra / 10.0) * 0.38}")
        4 -> println("seu peso no planeta terra é: ${(pterra / 10.0) * 2.64}")
        5 -> println("seu peso no planeta terra é: ${(pterra / 10.0) * 1.15}")
        6 -> println("seu peso no planeta terra é: ${(pterra / 10.0) * 1.17}")
        else -> println("este planeta não pode ser analisado")
    }
}

fun questao90(numero: Double) {
    if (numero > 20.0) {
        println(numero)
    }
}
