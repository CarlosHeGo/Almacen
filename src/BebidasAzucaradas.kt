class BebidasAzucaradas (id: Int, litros: Double, precio: Double, marca: String, val porcetajeAzucar: Double, private val promocion: Boolean): Bebidas(id, litros, precio, marca){
    override fun calcularPrecio(): Double {
        return if(promocion){
            precio*0.9
        } else precio
    }
    override fun mostrar(): String {
        return super.mostrar() + ", Porcentaje de azucar: $porcetajeAzucar%, ¿Promoción? $promocion"
    }
}