
import javax.print.attribute.SetOfIntegerSyntax

data class Tienda(val nombre: String, val clientes: List<Clientes>)



data class Clientes(val nombre: String, val ciudad: Ciudad, val pedidos: List<Pedido>) {
    override fun toString() = "$nombre from ${ciudad.nombre}"
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
	var productos = setOf(p1,p2,p3,p4)
    var ciudad1: Ciudad = Ciudad("Cádiz")
    var ciudad2: Ciudad = Ciudad("Sevilla")
    var ciudad3: Ciudad = Ciudad("Granada")
    var pedido1 : Pedido = Pedido(productos, true)
   /*
    * 4.2.1 Kotlin tiene métodos para transformar de un tipo a otro de coleciones. Normalmente comienzan con to, por ejemplo toSet.

Implementa un método para obtener un conjunto de todos los clientes.
  fun Tienda.obtenerConjuntoDeClientes(): 
  
4.2.2 Implementa los siguientes métodos para filtrar datos, que devolverán:

un conjunto de las ciudades de donde son los clientes, puedes hacer uso de map
fun Tienda.obtenerCiudadesDeClientes(): Set<Ciudad> =
TODO()  
una lista de los clientes que viven en una determinada ciudad determinada, puedes hacer uso de filter.
fun Tienda.obtenerClientesPor(ciudad:Ciudad): List<Cliente> =  
TODO()  
4.2.3 Implementa los siguientes métodos, recomendado haciendo uso de all, any, count y find. Piensa cuál usar en los siguientes métodos:

Método que devuelve true si todos los clientes son de una determinada ciudad
fun Tienda.checkTodosClientesSonDe(ciudad : Ciudad): Boolean =
TODO()
Método que devuelve true si al menos un cliente es de una determinada ciudad
fun Tieda.hayClientesDe(ciudad: Ciudad): Boolean =
TODO()
Método que devuelve el número de cliente de una determinada ciudad
fun Tienda.cuentaClientesDe(ciudad: Ciudad): Int =
TODO()
Método que devuelve un cliente que vive en una ciudad dada o nulo si no hay ninguno
fun Tienda.encuentraClienteDe(ciudad: Ciudad): Customer? =
TODO()
4.2.4 Implementa un método para que devuelva una lista de clientes, ordenadas descendientemente por el número de pedidos que ellos han realizado. Puedes hacer uso de sortedDescending o sortedByDescending.

fun Tienda.obtenerClientesOrdenadosPorPedidos(): List<Clientes> =
TODO()
4.2.5 Implementa un método para que devuelva una lista de clientes que tiene más pedidos sin entregar que entregados, puedes hacer uso de Partition.

fun Tienda.obtenerClientesConPedidosSinEngregar(): Set<Cliente> = 

4.2.6 Implementa un método para que devuelva

Los productos pedidos por un cliente, pudiendo usar flatmap
fun Cliente.obtenerProductosPedidos(): List<Producto> =


Los productos que fueron pedidos por al menos un cliente.
fun Tienda.obtenerProductosPedidos(): Set<Producto> =


4.2.7(Ampliación) Implementa un método para que devuelva el conjunto de productos que han sido pedidos por TODOS los clientes. Puedes usar flatMap y fold y Puedes usar Cliente.obtenerProductosPedidos()

fun Tienda.obtenerProductosPedidosPorTodos(): Set<Producto> =


4.2.8 Implementa un método para que devuelva

Encuentra el producto más caro entre los productos entregados pedidos por el cliente. Usa Pedido.estaEntregado
fun Cliente.encuentraProductoMasCaro(): Producto? = 
TODO()
Cuenta la cantidad de veces que un producto se ha pedido. Ten en cuenta que un cliente puede pedir el pedido varias veces. Puedes usar Cliente.obtenerProductosPedidos()
fun Tienda.obtenerNumeroVecesProductoPedido(producto: Producto): Int = 
TODO()
4.2.9 Implementa un método para que un map que almacene los clientes viviendo en una determinada ciudad. Puedes usar groupBy

fun Tienda.agrupaClientesPorCiudad(): Map<Ciudad, List<Cliente>> =
TODO()
4.2.10(Ampliación) Implementa un método para que devuelva

un mapa desde el nombre del cliente al cliente, puedes usar associateBy
fun Tienda.mapeaNombreACliente(): Map<String, Cliente> =
TODO()
un mapa desde el cliente a su ciudad, puedes usar associateWith
fun Tienda.mapeaClienteACiudad(): Map<Cliente, Ciudad> =
TODO()
un mapa desde el nombre del cliente a su ciudad, puedes usar associate
fun Tienda.mapeaNombreClienteACiudad(): Map<String, Ciudad> =
TODO()
4.2.11(Ampliación) Implementa un método para que devuelva

el cliente que ha realizado más pedidos en la tienda, puedes usar maxByOrNull.
fun Tienda.obtenerClientesConMaxPedidos(): Cliente? =
TODO()
el producto más caro que ha pedido el cliente, puedes usar flapMap y maxByOrNull y callable references.
fun Cliente.obtenerProductoMasCaroPedido(): Producto? =
TODO()
4.2.12 Implementa un método para que devuelva

la suma de los precios de todos los productos pedidos por un cliente, puedes usar flatMap y sumOf
fun Cliente.dineroGastado(): Double 

    */
    

    
    
    println(productos)
    println(p1)
    println(pedido1)

}
