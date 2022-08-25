package ejercicios

fun main() {
    print("Enter a number:")
    val nString: String? = readLine()
    if(nString !== null && isNumeric(nString)){
        val result = sumatoria(nString.toInt())
        println("Total sum is: $result")
    }
    else
        println("Error")
}

fun isNumeric(toCheck: String): Boolean {
    return toCheck.all { char -> char.isDigit() }
}

fun sumatoria(n: Int): Int {
    var cont: Int = 0
    var sum: Int = 0
    while(cont<n){
        cont++
        sum += cont
    }
    return sum
}