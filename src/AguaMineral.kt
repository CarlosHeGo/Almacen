class AguaMineral (id: Int, litros: Double, precio: Double, marca: String, private val origen: String): Bebidas (id, precio, litros, marca) {
    override fun calcularPrecio(): Double {
        return super.calcularPrecio()
    }
    override fun mostrar(): String {
        return super.mostrar() + "/ Origen: $origen"
    }
}