import kotlin.math.*

fun questao11() {
    println("Aprendendo Algoritmo!!!")
}

fun questao12() {
    print("Aprendendo Algoritmo !!!")
    print("Com Anita e Guto")
    println()
}

fun questao13() {
    println("Aprendendo Algoritmo!!!")
    println("Com Anita e Guto")
}

fun questao14() {
    print("Aprendendo Algoritmo !!!\n")
    print("Com Anita e Guto\n")
}

fun questao15() {
    println("Aprendendo Algoritmo \n Com Anita e Guto\n\n E implementando no UAL\n Fica muito mais fácil!! ")
}

fun questao16() {
    val x = 10
    println(x)
}

fun questao17() {
    val x = 10
    println("Valor de x = $x")
}

fun questao18() {
    val x = 10
    println("Valor de x = ${x + 1}")
}

fun questao19() {
    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${exp(0.5 * ln(64.0)).roundToInt()}")
    println("raiz com exp e log sem realint: ${exp(0.5 * ln(64.0))}")
    println(String.format("%.3f", sin(45.0 * Math.PI / 180.0) + 0.0001))
    println("potencia com exp e log e formatar: " + String.format("%.3f", exp(3.0 * ln(8.0)) + 0.001))
    println("potencia com exp e log sem formatar: ${exp(3.0 * ln(8.0))}")
    println("potencia com operador ** e formatar: " + String.format("%.3f", 8.0.pow(3.0)))
    println("raiz cubica: ${exp(1.0 / 3.0 * ln(8.0))}")
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para inteiro 5.5: ${5.5.roundToInt()}")
    println("convertendo para inteiro 6.5: ${6.5.roundToInt()}")
    println("convertendo para inteiro 6.5+0.0001: ${(6.5 + 0.0001).roundToInt()}")
    println("convertendo para inteiro 5.45: ${5.45.roundToInt()}")
    println("convertendo para inteiro 5.51: ${5.51.roundToInt()}")
    println("convertendo para real 87: ${87.toDouble()}")
    println("convertendo para int 3/4: ${(3.0 / 4.0).roundToInt()}")
}

fun questao20(c: String, c1: String) {
    println(c.length)
    println("concatenando: " + (c + c1))
    val d = c
    println("E O CONTEUDO DE D: $d")
    val d1 = c + c1
    println("concatenacao: $d1")
    println("primeiro caractere: ${c.firstOrNull() ?: ""}")
    println("ultimo caractere: ${c.lastOrNull() ?: ""}")
    println("todos menos o primeiro: ${if (c.length > 1) c.substring(1) else ""}")
    println("o terceiro elemento: ${if (c.length > 3) c[3] else ""}")
    println("os tres primeiros elementos: ${if (c.length >= 3) c.substring(0, 3) else c}")
    println("os tres ultimos elementos: ${if (c.length >= 3) c.substring(c.length - 3) else c}")
}
