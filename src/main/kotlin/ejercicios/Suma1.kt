package ejercicios
import java.lang.NumberFormatException
import java.lang.NullPointerException

fun main(){
    val result:Int = suma1()
    println("Result: $result")
}

fun suma1():Int{
    var i:Int = 0
    var sum: Int = 0
    return try{
        while(i<5) {
            print("Enter a number:")
            val number:Int? = readLine()?.toInt()
            if(number!=null){
                i++
                sum += number
            }
            else
                throw NullPointerException()
        }
        sum
    }
    catch (e:NullPointerException){
        println("Error: Null input")
        -1
    }
    catch (e:NumberFormatException){
        println("Error: Wrong Format")
        -1
    }
}