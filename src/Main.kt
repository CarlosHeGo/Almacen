fun main() {

    val agua1 = AguaMineral (1, 1.5, 0.25,"Fuente primavera", "La Vera" )
    val agua2 = AguaMineral (2, 1.5, 0.73,"Cabreiroa", "Verin" )
    val agua3 = AguaMineral (3, 1.5, 0.73,"Font Vella", "Sacalm" )
    val agua4 = AguaMineral (4, 1.5, 0.65,"Bezoya", "Ortigosa Del Monte" )
    val agua5 = AguaMineral (5, 0.75, 0.76,"Aquarel", "Montseny" )
    val bebidaAzucar1 = BebidasAzucaradas (6, 0.33,0.97,"Coca Cola", 10.6,true)
    val bebidaAzucar2 = BebidasAzucaradas (7, 0.33,0.76,"Kas Limon", 4.3,false)
    val bebidaAzucar3 = BebidasAzucaradas (8, 0.50,1.62,"Fuze Tea", 4.3,false)
    val bebidaAzucar4 = BebidasAzucaradas (9, 0.50,1.25,"Burn", 15.0,true)
    val bebidaAzucar5 = BebidasAzucaradas (10, 0.33,0.66,"7Up", 4.7,false)

    val almacen = Almacen()
    almacen.mostrarBebida()
    almacen.agregarBebida(agua1)
    almacen.agregarBebida(agua2)
    almacen.agregarBebida(agua3)
    almacen.agregarBebida(agua4)
    almacen.agregarBebida(agua5)
    almacen.agregarBebida(bebidaAzucar5)
    almacen.agregarBebida(bebidaAzucar1)
    almacen.agregarBebida(bebidaAzucar3)
    almacen.eliminarBebida(5)
    almacen.mostrarBebida()

    println( almacen.calcularPrecio("Coca Cola"))
    println( almacen.calcularPrecio(3))
    println( almacen.calcularPrecio())

}