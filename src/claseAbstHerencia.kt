abstract class FiguraGeometrica {
    abstract fun Area(): Double
}
class Rectangulo(val ancho: Double, val alto: Double) : FiguraGeometrica() {
    override fun Area(): Double {
        return ancho * alto
    }
}
class Circulo(val radio: Double) : FiguraGeometrica() {
    override fun Area(): Double {
        return Math.PI * radio * radio
    }
}
fun main() {
    val rectangulo = Rectangulo(4.0, 5.0)
    val circulo = Circulo(3.0)
    println("El Área del rectángulo es: ${rectangulo.Area()}")
    println("El Área del círculo es: ${circulo.Area()}")
}
