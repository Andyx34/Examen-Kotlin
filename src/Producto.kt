class Producto(val nombre: String, val precio: Double){
fun enseñarPrecioIva() {
    val precioIva = precio * 1.16
    println(" El precio con IVA es : $precioIva")
}
}
fun main(){
    val laptop = Producto("Laptop X", 1500.0)
    laptop.enseñarPrecioIva()
}