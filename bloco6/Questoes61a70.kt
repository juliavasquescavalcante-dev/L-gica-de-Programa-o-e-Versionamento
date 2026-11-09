import kotlin.math.*

fun questao61(termo: Double, razao: Double) {
    val quinto = termo * razao.pow(4.0)
    println("O 5o termo desta P.G. e: $quinto")
}

fun questao62(preco: Double) {
    val npreco = preco * 0.91
    println("preco com desconto: $npreco")
}

fun questao63(na: Int, vha: Double, pd: Double) {
    val sb = na * vha
    val td = (pd / 100.0) * sb
    val sl = sb - td
    println("salario liquido: $sl")
}

fun questao64(c: Double) {
    val f = (9 * c + 160) / 5.0
    println("o valor da temperatura em graus fahrenheit e = $f")
}

fun questao65(altura: Double, raio: Double) {
    val volume = Math.PI * raio.pow(2.0) * altura
    println("o volume da lata e $volume")
}

fun questao66(tempo: Double, vel: Double) {
    val dist = tempo * vel
    val litros = dist / 12.0
    println("velocidade = $vel\ntempo = $tempo\ndistancia = $dist\nlitros = $litros")
}

fun questao67(valor: Double, taxa: Double, tempo: Int) {
    val prest = valor + (valor * (taxa / 100.0) * tempo)
    println("o valor da prestacao em atraso e = $prest")
}

fun questao68(aInit: Double, bInit: Double) {
    var a = aInit
    var b = bInit
    val aux = a
    a = b
    b = aux
    println("a = $a\nb = $b")
}

fun questao69(num: Double, denom: Double) {
    println("decimal: ${num / denom}")
}

fun questao70(cres: Double) {
    val cgorj = cres * 1.10
    println("o valor da conta com a gorjeta sera: " + String.format("%.2f", cgorj))
}
