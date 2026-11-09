import kotlin.math.*

fun questao71(hora: Int, minuto: Int) {
    val tminuto = hora * 60 + minuto
    println("Ate agora se passaram: $tminuto minutos")
}

fun questao72(deposito: Double, taxa: Double) {
    val valor = deposito * taxa / 100.0
    val total = deposito + valor
    println("Rendimentos: $valor\nTotal: $total")
}

fun questao73(num: Double) {
    val numi = num.toInt()
    val numfrac = num - numi
    val numa = num.roundToInt()
    println("parte inteira: $numi")
    println("parte fracionaria: " + String.format("%.3f", numfrac))
    println("numero arredondado: $numa")
}

fun questao74(salmin: Double, salpe: Double) {
    val num = salpe / salmin
    println("a pessoa ganha $num salarios minimos")
}

fun questao75(peso: Int) {
    val pesogramas = peso * 1000
    val novopeso = pesogramas * 1.12
    println("peso em gramas: $pesogramas")
    println("novo peso: $novopeso")
}

fun questao76(num: Int) {
    println("sucessor: ${(num + 1) % 61}")
}

fun questao77(a: Double, b: Double) {
    val d = (a - b).pow(2.0)
    val q = a.pow(2.0) - b.pow(2.0)
    println("o quadrado da diferenca = $d\ndiferenca dos quadrados = $q")
}

fun questao78(n: Int) {
    val nd = n * (n - 3) / 2.0
    println("numero de diagonais: $nd")
}

fun questao79(p: Double, i: Double, n: Int) {
    val va = p * (((1 + i).pow(n.toDouble())) - 1) / i
    println("O valor acumulado: $va")
}

fun questao80(quant: Int, valAluguel: Double) {
    val fatAnual = (quant / 3.0) * valAluguel * 12
    val multas = valAluguel * 0.1 * (quant / 3.0) / 10.0
    val quantFinal = quant - quant * 0.02 + quant / 10.0
    println("Faturamento anual: $fatAnual")
    println("Multas mensais: $multas")
    println("Quantidade de fitas no final do ano: $quantFinal")
}
