import kotlin.math.*

fun questao41(a: Double, b: Double, c: Double, d: Double) {
    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10.0
    println("media ponderada: $mp")
}

fun questao42(angulo: Double) {
    val rang = angulo * Math.PI / 180.0
    println("seno: ${sin(rang)}")
    println("co-seno: ${cos(rang)}")
    println("tangente: ${tan(rang)}")
    println("co-secante: ${1.0 / sin(rang)}")
    println("secante: ${1.0 / cos(rang)}")
    println("cotangente: ${1.0 / tan(rang)}")
}

fun questao43(num: Double) {
    val logaritmo = ln(num) / ln(10.0)
    println("logaritmo: $logaritmo")
}

fun questao44(num: Double, base: Double) {
    val logaritmo = ln(num) / ln(base)
    println("o logaritmo de $num na base $base e: $logaritmo")
}

fun questao45(num: Double) {
    val quad = num.pow(2.0)
    val raizquad = sqrt(num)
    println("numero: $num")
    println("quadrado: $quad")
    println("raiz quadrada: $raizquad")
}

fun questao46(saldo: Double) {
    val nsaldo = saldo * 1.01
    println("novo saldo: $nsaldo")
}

fun questao47(num: Int) {
    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10
    val num1 = u * 100 + d * 10 + c
    println("numero: $num")
    println("invertido: $num1")
}

fun questao48(sm: Double, qtdade: Double) {
    val preco = sm / 700.0
    val vp = preco * qtdade
    val vd = vp * 0.9
    println("preco do quilowatt: $preco\n valor a ser pago: $vp\n valor com desconto: $vd")
}

fun questao49(nome: String) {
    println("todo nome: $nome")
    println("primeiro caractere: ${nome.firstOrNull() ?: ""}")
    println("ultimo caractere: ${nome.lastOrNull() ?: ""}")
    println("primeiro ao terceiro caractere: ${if (nome.length >= 3) nome.substring(0, 3) else nome}")
    println("quarto caractere: ${if (nome.length >= 4) nome[3] else ""}")
    println("todos menos o primeiro: ${if (nome.length > 1) nome.substring(1) else ""}")
    println("os dois ultimos: ${if (nome.length >= 2) nome.substring(nome.length - 2) else nome}")
}

fun questao50(base: Double, altura: Double) {
    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2.0) + altura.pow(2.0))
    println("perimetro = $perimetro")
    println("area = $area")
    println("diagonal = $diagonal")
}
