fun sumarPares(Numeros : Array<Int>): Int{
    return Numeros.filter{it%2==0}.sum()
}
fun main() {
    val Numeros = arrayOf(1, 2, 3, 4, 5, 6)
    val suma = sumarPares(Numeros)
    println(" La suma de los numeros pares es: $suma")
}