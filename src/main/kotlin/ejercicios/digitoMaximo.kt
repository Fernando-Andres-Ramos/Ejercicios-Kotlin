fun main(){
    print("Ingrese un numero:")
    val number:String? = readLine()
    if(number!=null && isNumeric(number))
        println(digitoMaximo(number.toInt()))
    else
        print("Error al ingresar el valor")
}

fun digitoMaximo (number:Int):String {
    val numberList: List<String> = number.toString().split("")
    val max: String? = numberList.maxOrNull()
    return "digito maximo de ($number) = $max"
}