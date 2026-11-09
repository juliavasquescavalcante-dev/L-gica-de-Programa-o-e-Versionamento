import kotlin.math.*

fun questao91(num1: Int, num2: Int) {
    val soma = num1 + num2
    if (soma > 10) println("soma: $soma")
}

fun questao92(num1: Double, num2: Double) {
    val soma = num1 + num2
    if (soma > 20.0) println("soma: ${soma + 8}") else println("soma: ${soma - 5}")
}

fun questao93(numero: Double) {
    if (numero > 0.0) println("raiz: ${sqrt(numero)}")
    else if (numero < 0.0) println("quadrado: ${numero.pow(2.0)}")
}

fun questao94(numero: Int) {
    if (numero % 3 == 0) println("multiplo de 3") else println("nao e multiplo de 3")
}

fun questao95(numero: Int) {
    if (numero % 5 == 0) println("e divisivel por 5") else println("nao e divisivel por 5")
}

fun questao96(numero: Int) {
    if (numero % 3 == 0 && numero % 7 == 0) println("divisível por 3 e por 7")
    else println("não e divisível por 3 e por 7")
}

fun questao97(numero: Int) {
    if (numero % 10 == 0) println("múltiplo de 10")
    else if (numero % 2 == 0) println("múltiplo de 2")
    else if (numero % 5 == 0) println("múltiplo de 5")
    else println("não é múltiplo de 2 nem de 5")
}

fun questao98(sb: Double, vp: Double) {
    if (vp <= 0.3 * sb) println("emprestimo concedido") else println("emprestimo negado")
}

fun questao99(num: Int) {
    val c = num / 100
    if (c % 2 == 0) println("o algarismo das centenas e par: $c")
    else println("o algarismo das centenas e impar: $c")
}

fun questao100(num: Int) {
    val c = num / 100
    if (c % 4 == 0) println("o numero e multiplo de 4: $c")
    else println("o numero nao e multiplo de 4: $c")
}
