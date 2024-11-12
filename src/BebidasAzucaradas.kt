class BebidasAzucaradas (id: Int, litros: Double, precio: Double, marca: String, val porcetajeAzucar: Double, private val promocion: Boolean): Bebidas(id, litros, precio, marca){
    override fun calcularPrecio(): Double {
        var nuevoPrecio: Double
        if (promocion) {
            nuevoPrecio = precio * 0.90
        }
        else {
            nuevoPrecio = precio
        }
        return nuevoPrecio
    }
    override fun mostrar(): String {
        return super.mostrar() + " / Porcentaje de azucar: $porcetajeAzucar % / Promoción? $promocion"
    }
}