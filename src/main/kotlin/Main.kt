package un4.collections

import javax.print.attribute.SetOfIntegerSyntax

data class Tienda(val nombre: String, val clientes: List<Clientes>)



data class Clientes(val nombre: String, val ciudad: Ciudad, val pedidos: List<Pedido>) {
    override fun toString() = "$nombre from ${ciudad.nombre}"
}

data class Pedido(val productos: List<Producto>, val estaEntregado: Boolean)

val productos: List<Producto> = listOf(p1,p2,p3)

data class Producto(val nombre: String, val precio: Double) {
    override fun toString() = "'$nombre' for $precio"
}

data class Ciudad(val nombre: String) {
    override fun toString() = nombre
}

fun main(args: Array<String>) {




    var p1: Producto = Producto("leche", 1.99)
    var p2: Producto = Producto("Pan", 1.50)
    var p3: Producto = Producto("aceite", 1.79)
    var p4: Producto = Producto("chocolate", 1.00)

    var c1: Ciudad = Ciudad("Cádiz")
    var c2 : Ciudad = Ciudad("Sevilla")

    println(productos)

}