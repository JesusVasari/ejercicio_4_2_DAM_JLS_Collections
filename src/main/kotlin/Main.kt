data class Tienda(val nombre: String, val clientes: List<Clientes>) {

    //4.1
    fun obtenerConjuntoClientes(): Set<Clientes> = clientes.toSet()

    // 4.3.2
//
    fun obtenerCiudadesDeClientes(): Set<Ciudad> = clientes.map { it.ciudad }.toSet()

    //4-3-1
    fun obtenerClientesPor(ciudad: Ciudad): List<Clientes> {
        return clientes.filter { it.ciudad == ciudad }
    }

    // 4.3.3.1
    fun checkTodosClientesSonDe(ciudad: Ciudad): Boolean {
        return clientes.all { it.ciudad == ciudad }
    }

    // 4.3.3.2
    fun hayClientesDe(ciudad: Ciudad): Boolean {
        return clientes.any() { it.ciudad == ciudad }
    }

    //4.3.3.3
    fun encuentraClienteDe(ciudad: Ciudad): Clientes? {
        return clientes.find { it.ciudad == ciudad }
    }

    //v4..3.4
    fun obtenerClientesOrdenadosPorPedidos(): List<Clientes> {
        return listOf<Clientes>().sortedByDescending { it.pedidos.count() }
    }

    //4.3.5
    fun obtenerClientesConPedidosSinEntregar(): Set<Clientes> {
        return emptySet<Clientes>().partition { it.pedidos.count { it.estaEntregado } > it.pedidos.count { !it.estaEntregado } }.second.toSet()
    }
 //4.6.2
    fun obtenerProductosPedidos(): Set<Producto> {
        return clientes.flatMap { it.pedidos }.flatMap { it.productos }.toSet()
    }
    //4.7
    fun Tienda.obtenerProductosPedidosPorTodos(): Set<Producto> {
        return clientes.flatMap { it.pedidos }.flatMap { it.productos }.toSet()
    }


    //4.3.9
    fun agrupaClientesPorCiudad(): Map<Ciudad, List<Clientes>> {
        return clientes.groupBy { it.ciudad }
    }

    //4.10.1
    fun mapeaNombreACliente(): Map<String, Clientes> {
        return clientes.associateBy { it.nombre }
    }

    //4.10.2
    fun mapeaClienteACiudad(): Map<Clientes, Ciudad> {
        return clientes.associateWith { it.ciudad }
    }

    //4.11
    fun obtenerClientesConMaxPedidos(): Clientes? {
        return clientes.maxByOrNull { it.pedidos.count() }
    }
    //4.12
    fun dineroGastado(): Double {
        return clientes.flatMap { it.pedidos }.flatMap { it.productos }.sumOf { it.precio }.toDouble()
    }


}


data class Clientes(val nombre: String, val ciudad: Ciudad, val pedidos: List<Pedido>) {
    override fun toString() = "$nombre oriundo de ${ciudad.nombre}"
    //4.6
    fun obtenerProductosPedidos(): List<Producto> {
        return pedidos.flatMap { it.productos }
    }

    //4.8
    fun obtenerProductoMasCaroPedido(): Producto? {
        return pedidos.filter { it.estaEntregado }.flatMap { it.productos }.maxByOrNull { it.precio }
    }

    // 4.12
    fun dineroGastado(): Double {
        return pedidos.filter { it.estaEntregado }.flatMap { it.productos }.sumOf { it.precio }
    }

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
    var tienda2: Tienda = Tienda("LIDL", listOf(cliente3, cliente1))



    tienda1.obtenerClientesPor("Cádiz"))
    println(" los clientes son: ")


}
