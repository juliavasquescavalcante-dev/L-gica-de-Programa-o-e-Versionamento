import kotlin.math.*

fun questao111(a: Double, b: Double) {
    if (a > b) println("maior: $a") else println("maior: $b")
}

fun questao112(a: Double, b: Double) {
    if (a < b) println("menor: $a") else println("menor: $b")
}

fun questao113(a: Double, b: Double) {
    if (a < b) println("$a $b") else println("$b $a")
}

fun questao114(a: Double, b: Double) {
    if (a > b) println("$a $b") else println("$b $a")
}

fun questao115(x: Double, y: Double) {
    if (x > y) {
        println("${sqrt(x)}\n${y.pow(2.0)}")
    } else if (y > x) {
        println("${sqrt(y)}\n${x.pow(2.0)}")
    } else {
        println("numeros iguais")
    }
}

fun questao116(a: Double, b: Double, c: Double) {
    val maior = if (a > b) (if (a > c) a else c) else (if (b > c) b else c)
    println("maior: $maior")
}

fun questao117(a: Double, b: Double, c: Double) {
    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c
    println("maior: $maior")
}

fun questao118(aInit: Double, bInit: Double, cInit: Double) {
    var a = aInit
    var b = bInit
    var c = cInit
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    println("Ordem Crescente: $a $b $c")
}

fun questao119(aInit: Double, bInit: Double, cInit: Double) {
    var a = aInit
    var b = bInit
    var c = cInit
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    println("Ordem Decrescente: $c $b $a")
}

fun questao120(aInit: Double, bInit: Double, cInit: Double) {
    var a = aInit
    var b = bInit
    var c = cInit
    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }
    val menor = a
    val intermediario = b
    val maior = c
    println("maior: $maior\nintermediario: $intermediario\nmenor: $menor")
}
