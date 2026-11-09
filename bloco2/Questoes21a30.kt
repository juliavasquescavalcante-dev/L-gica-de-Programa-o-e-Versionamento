fun questao21() {
    println("TESTANDO HIERARQUIA\n")
    println("12 + 5 / 2 é igual a: ${12.0 + 5.0 / 2.0}")
    println("É DIFERENTE DE (12 + 5) / 2 que é igual a: ${(12.0 + 5.0) / 2.0}, logo / tem HIERARQUIA MAIOR do que + ou -")
    println("\n64 ** 1 / 4 é igual a: ${Math.pow(64.0, 1.0) / 4.0}")
    println("É DIFERENTE de 64 ** (1/4) que é igual a: ${Math.pow(64.0, 0.25)} logo ** tem HIERARQUIA MAIOR do que * ou /")
    println("\n3 * 7 % 5 é igual a: ${3 * 7 % 5}")
    println("3 * 7 div 5 é igual a: ${3 * 7 / 5}")
}

fun questao22() {
    println("TESTANDO HIERARQUIA")
    println("20 / 4 div 2 é igual a: ${(20 / 4) / 2}")
    println("30 / 4 div 2 é igual a: ${(30 / 4) / 2}")
    println("7 div 4: ${7 / 4}")
    println("6 div 4: ${6 / 4}")
}

fun questao23(a: Int) {
    val d = (a % 100) / 10
    println("algarismo da casa das dezenas: $d")
}

fun questao24(a: Int) {
    val d = (a / 10) % 10
    println("algarismo da casa das dezenas: $d")
}

fun questao25(data: Int) {
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}

fun questao26(data: Int) {
    val dia = data / 10000
    val mes = (data % 10000) / 100
    val ano = data % 100
    val ndata = mes * 10000 + dia * 100 + ano
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
    println("\nDATA NO FORMATO MMDDAA: $ndata")
}

fun questao27() {
    var x = 2
    var y = 5
    println("x = $x")
    x++
    println("y = $y")
    y--
    println("novo valor de x = $x")
    println("novo valor de y = $y")
}

fun questao28() {
    println("E PRECISO FAZER TODOS OS ALGORITMOS PARA APRENDER")
}

fun questao29(nome: String) {
    println(nome)
}

fun questao30() {
    val produto = 28 * 43
    println("O produto entre os dois e: $produto")
}
