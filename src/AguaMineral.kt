class AguaMineral (id: Int, litros: Double, precio: Double, marca: String, private val origen: String): Bebidas (id, litros, precio, marca) {
    override fun calcularPrecio(): Double {
        return precio
    }
    override fun mostrar(): String {
        return super.mostrar() + "/ Origen: $origen"
    }
}