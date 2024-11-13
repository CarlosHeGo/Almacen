import kotlin.system.exitProcess

class Almacen (val filas: Int = 5, val columnas: Int = 5) {

    var estanterias: Array<Array<Bebidas?>> = Array(5){Array<Bebidas?>(5){null} }

    fun agregarBebida(bebida: Bebidas){
        if(existeId(bebida.id)){
            println("ERROR. No se puede agregar ${bebida.marca}, ya se encuentra en las estanterias el ID ${bebida.id}.")
        }
        else {
            var bebidaAgregada = false
            for (fila in estanterias.indices){
                for (posicion in estanterias[fila].indices){
                    if(estanterias[fila][posicion] == null){
                        estanterias[fila][posicion] = bebida
                        println("Insertada ${bebida.marca} con éxito")
                        bebidaAgregada = true
                        break
                    }
                }
                if (bebidaAgregada)
                    break
            }
            if (!bebidaAgregada)
                println("Almacen lleno, no se puede agregar ${bebida.marca}")
        }
    }

    fun existeId(id: Int): Boolean{
        for(fila in estanterias){
            for(posicion in fila){
                if(posicion?.id == id)
                    return true
            }
        }
        return false
    }

    fun eliminarBebida(id: Int){
        var hayBebida = false
        for (fila in estanterias.indices){
            for (posicion in estanterias[fila].indices){
                if(estanterias[fila][posicion]?.id == id){
                    estanterias[fila][posicion] = null
                    hayBebida = true
                    println("Bebida con ID $id eliminada con éxito")
                }
            }
        }
        if(!hayBebida)
            println("No se ha encontrado la bebida con ID $id")
    }

    fun mostrarBebida(){
        var hayBebida = false
        for (fila in estanterias.indices){
            for (posicion in estanterias[fila].indices){
                val bebida = estanterias[fila][posicion]
                if (bebida != null){
                    if (bebida is AguaMineral)
                        println("En la posicion [$fila][$posicion]: Agua mineral con ${bebida.mostrar()}")
                    else if (bebida is BebidasAzucaradas)
                        println("En la posicion [$fila][$posicion]: Bebida azucarada con ${bebida.mostrar()}")
                    hayBebida = true
                }
            }
        }
        if(!hayBebida)
            println("No hay bebidas en las estanterias")
    }

    //calcula el precio de todas las bebidas
    fun calcularPrecio():Double {
        var precioTotal = 0.0
        for (fila in estanterias){
            for (bebida in fila){
                if (bebida != null){
                    precioTotal += bebida.calcularPrecio()
                }
            }
        }
        println("El precio total de todas las bebidas del almacén es de : $precioTotal€")
        return precioTotal
    }

    //calcula el precio de una marca
    fun calcularPrecio(marca: String): Double{
        var precioTotal = 0.0
        for (fila in estanterias){
            for (bebida in fila){
                if (bebida != null && bebida.marca == marca){
                    precioTotal += bebida.calcularPrecio()
                }
            }
        }
        println("El precio total de las bebidas de la marca $marca es de : $precioTotal€")
        return precioTotal
    }

    //calcula el precio de una columna
    fun calcularPrecio(columna: Int): Double{
        var precioTotal = 0.0
        if (columna < 0 || columna >=columnas){
            println("ERROR. Columna invalida")
        }
        for (fila in estanterias){
            val bebida = fila[columna]
            if (bebida != null){
                precioTotal += bebida.calcularPrecio()
            }
        }
        println("El precio total de las bebidas de la columna $columna es de : $precioTotal€")
        return precioTotal

    }


}