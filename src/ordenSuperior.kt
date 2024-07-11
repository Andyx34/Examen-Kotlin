fun aplicarOperacion(numero:Int,operacion :(Int)->Int):Int{
    return operacion(numero)
}
fun cuadrado(numero: Int): Int {
    return numero * numero
}
fun main(){
    val cuad = aplicarOperacion(5,::cuadrado)
    println("El resultado del numero al Cuadrado  es: $cuad")
}