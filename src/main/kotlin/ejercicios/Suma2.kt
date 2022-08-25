package ejercicios
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main(){
    println("Result: ${suma2()}")
}

fun suma2():Int{
    var i:Int = 0
    var sum: Int = 0
    return try{
        print("Enter a number N:")
        val n = readLine()?.toInt()
        if(n!=null){
            while(i<n) {
                print("Enter a number:")
                val number = readLine()?.toInt()
                if(number!=null){
                    i++
                    sum += number
                }
                else
                    throw NullPointerException()
            }
            sum
        }
        else
            throw NullPointerException()

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