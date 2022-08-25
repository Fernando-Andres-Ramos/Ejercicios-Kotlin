fun main(){
    dibujarPiramide(10)
}

fun dibujarPiramide (h:Int):Unit {
    var drawing: String = "*"
    val aux = drawing
    var i = 0
    while(i<h){
        println(drawing)
        drawing += aux
        i++
    }
}

