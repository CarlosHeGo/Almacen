open class Bebidas (var id: Int, var litros: Double, var precio: Double, var marca: String) {
    open fun calcularPrecio(): Double = precio

    open fun mostrar(): String {
        return "id: $id, Marca: $marca, Cantidad: $litros litros, Precio: $precio€"
    }
}