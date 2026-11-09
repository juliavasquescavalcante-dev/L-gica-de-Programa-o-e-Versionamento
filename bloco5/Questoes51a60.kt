import kotlin.math.*

fun questao51(raio: Double) {
    val perimetro = 2 * Math.PI * raio
    val area = Math.PI * raio.pow(2.0)
    println("perimetro: $perimetro")
    println("area: $area")
}

fun questao52(lado: Double) {
    val perimetro = 4 * lado
    val area = lado.pow(2.0)
    val diagonal = lado * sqrt(2.0)
    println("perimetro: $perimetro")
    println("area: $area")
    println("diagonal: $diagonal")
}

fun questao53(a: Double, b: Double, c: Double) {
    val diagonal = sqrt(a.pow(2.0) + b.pow(2.0) + c.pow(2.0))
    println("diagonal: $diagonal")
}

fun questao54(base: Double, altura: Double) {
    println("Area = ${(base * altura) / 2.0}")
}

fun questao55(diagmaior: Double, diagmenor: Double) {
    val area = (diagmaior * diagmenor) / 2.0
    println("area = $area")
}

fun questao56(nome: String, idade: Int) {
    println("nome = $nome")
    println("idade = $idade")
}

fun questao57(pr1: Double, pr2: Double) {
    val mf = (pr1 + pr2) / 2.0
    println("media truncada = ${floor(mf).toInt()}")
    println("media arredondada = ${mf.roundToInt()}")
}

fun questao58(xnum1: Double, xnum2: Double, xnum3: Double) {
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("X = $x")
}

fun questao59(b: Double, c: Double) {
    val a = sqrt(b.pow(2.0) + c.pow(2.0))
    println("A hipotenusa e: $a")
}

fun questao60(termo: Int, razao: Int) {
    val dec = termo + 9 * razao
    println("o 10 termo desta P.A. e: $dec")
}
