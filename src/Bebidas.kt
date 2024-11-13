open class Bebidas (val id: Int, val litros: Double, var precio: Double, val marca: String) {
    open fun calcularPrecio(): Double = precio

    open fun mostrar(): String {
        return "id: $id / Marca: $marca / Cantidad: $litros litros / Precio: $precio €"
    }
}