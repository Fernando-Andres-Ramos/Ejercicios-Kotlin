package ejercicios
fun main(){
    println("Result: ${suma3()}")
}

fun suma3():Int{
    var flag:Int = 0
    var sum: Int = 0
    while(flag == 0) {
        print("Enter a number:")
        val number = readLine()
        if(number == "" || number == null || !isNumeric(number))
            flag = 1
        else
            sum += number.toInt()
    }
    return sum
}