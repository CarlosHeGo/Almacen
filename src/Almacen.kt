class Almacen {
    val estanteria = Array(5){Array(5){0} } //matriz 5x5 rellena de 0

    fun agregarBebida(bebida: Bebidas){
        for (fila in estanteria){
            for (posicion in fila){
                if(posicion.equals(bebida.id))
            }
        }
    }

    fun eliminarBebida(){

    }

    fun mostrarBebida(){

    }

    fun calcularPrecio(){

    }

}