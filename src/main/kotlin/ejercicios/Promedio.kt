package ejercicios

fun main(){
    println("Result: ${promedio()}")
}

fun promedio():Float{
    var flag:Int = 0
    var sum: Int = 0
    var i: Int = 0
    while(flag == 0) {
        print("Enter a number:")
        val number = readLine()
        if(number == "" || number == null || !isNumeric(number))
            flag = 1
        else{
            i++
            sum += number.toInt()
        }
    }
    return sum.toFloat()/i.toFloat()
}