import kotlin.math.floor

fun main() {

    val mano = ManosTruco()
    var numeros: Array<Int> = mano.obtenerNumeros()
    var palos: Array<String> = mano.obtenerPalos()

    while(hayRepetidos(numeros,palos)){
        numeros = mano.obtenerNumeros()
        palos = mano.obtenerPalos()
    }

    println("Su mano es:")
    for (i in 0..2)
        println("${numeros[i]} de ${palos[i]}")
    println("Su envido/flor es de : ${puntosTruco(numeros,palos)} puntos")
}


/* Función para calcular los puntos de la mano de truco */
fun puntosTruco(numeros:Array<Int>,palos:Array<String>):Int{

    var puntos = 0

    when{
        palos[0]==palos[1]&&palos[0]==palos[2]-> {
            for(i in 0..2){
                if(numeros[i]<10)
                    puntos += numeros[i]
            }
            puntos += 20
        }

        palos[0]==palos[1]-> {
            for(i in 0..1){
                if(numeros[i]<10)
                    puntos += numeros[i]
            }
            puntos += 20
        }
        palos[1]==palos[2]-> {
            for(i in 1..2){
                if(numeros[i]<10)
                    puntos += numeros[i]
            }
            puntos += 20
        }
        palos[0]==palos[2]-> {
            if(numeros[0]<10)
                puntos += numeros[0]
            if(numeros[2]<10)
                puntos += numeros[2]
            puntos += 20
        }
        else -> {
            var maxNum = 0
            for (i in 0..2){
                if(numeros[i] in (maxNum + 1)..7)
                    maxNum = numeros[i]
            }
            puntos = maxNum
        }
    }
    return puntos
}


/* Clase para generar las manos de truco automaticamente y de forma aleatoria */
class ManosTruco {
    private val palos: Array<String> = arrayOf("Espada","Basto","Oro","Copa") //Palos posibles del truco
    private val numeros: Array<Int> = arrayOf(1,2,3,4,5,6,7,10,11,12) // Numeros posibles del truco

    /* Obteno los palos */
    fun obtenerPalos():Array<String>{
        val palosObtenidos: ArrayList<String> = arrayListOf()
        var i = 0
        while(i<3){
            val randomId = floor(Math.random()*palos.size).toInt()
            palosObtenidos.add(palos[randomId])
            i++
        }
        return palosObtenidos.toTypedArray()
    }

    /* Obteno los numeros */
    fun obtenerNumeros():Array<Int>{
        val numerosObtenidos: ArrayList<Int> = arrayListOf()
        var i = 0
        while(i<3){
            val randomId = floor(Math.random()*numeros.size).toInt()
            numerosObtenidos.add(numeros[randomId])
            i++
        }
        return numerosObtenidos.toTypedArray()
    }
}

/* Analizar si hay cartas repetidas */
fun hayRepetidos(numeros:Array<Int>,palos:Array<String>):Boolean{
    return when{
        numeros[0]==numeros[1]&&palos[0]==palos[1] -> true
        numeros[0]==numeros[2]&&palos[0]==palos[2] -> true
        numeros[1]==numeros[2]&&palos[1]==palos[2] -> true
        else -> false
    }
}