import kotlin.NullPointerException

fun main(){
    print("Vocales: ${contarVocales()}")
}

fun contarVocales():Int {
    return try {
        var i: Int = 0
        print("Enter a string:")
        val str: String? = readLine()
        if (str!=null){
            val array = str.lowercase().split("")
            array.forEach { if(esVocal(it)) i++}
            i
        }
        else
            throw NullPointerException()
    }

    catch (e: NullPointerException) {
        println("Error:Ingreso Null")
        return 0
    }
}

fun esVocal(letra:String):Boolean{
    if(letra=="a"||letra=="e"||letra=="i"||letra=="o"||letra=="u")
        return true
    return false
}