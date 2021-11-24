data class Tienda(val nombre: String, val clientes: List<Clientes>) {

fun obtenerConjuntoClientes(){

}
    fun obtenerCiudades() : Map<String, Int> {
        var ciudad = setOf<Ciudad>()
        var city = mapOf("ciudad1" to 1, "ciudad2" to 2)
        return (city)
    }
    //fun obtenerClientesPor(ciudad:Ciudad): List<Clientes>  {
     //   var cité = listOf<Clientes>().filter { it = Cádiz}
    // }

}



data class Clientes(val nombre: String, val ciudad: Ciudad, val pedidos: List<Pedido>) {
    override fun toString() = "$nombre oriundo de ${ciudad.nombre}"
}


data class Pedido(val productos: List<Producto>, val estaEntregado: Boolean)


data class Producto(val nombre: String, val precio: Double) {
    override fun toString() = "'$nombre' por $precio"
}

data class Ciudad(val nombre: String) {
    override fun toString() = nombre
}

fun main(args: Array<String>) {


    var p1: Producto = Producto("leche", 1.99)
    var p2: Producto = Producto("Pan", 1.50)
    var p3: Producto = Producto("aceite", 1.79)
    var p4: Producto = Producto("chocolate", 1.00)
    var p5: Producto = Producto("natillas", 2.00)
    var p6: Producto = Producto("pizza", 1.49)

    var pedido2: Pedido = Pedido(listOf(p1, p2, p3, p4), true)
    var pedido1: Pedido = Pedido(listOf(p6, p5, p3, p4), true)
    var pedido3: Pedido = Pedido(listOf(p5, p2, p3), true)

    var ciudad1: Ciudad = Ciudad("Cádiz")
    var ciudad2: Ciudad = Ciudad("Sevilla")
    var ciudad3: Ciudad = Ciudad("Granada")

    var cliente1: Clientes = Clientes("Pepito Grillo", ciudad1, listOf(pedido1))
    var cliente2: Clientes = Clientes("Perico de los palotes", ciudad2, listOf(pedido2))
    var cliente3: Clientes = Clientes("La Uchi", ciudad1, listOf(pedido3))

    var tienda1: Tienda = Tienda("ALDI", listOf(cliente1, cliente2))
    var tienda2:Tienda = Tienda("LIDL",  listOf(cliente3,cliente1))


    tienda1.obtenerCiudades()

    println(p1)
    println(pedido1)
    println(cliente1)
    println(tienda1)
    println(tienda2)

}
