fun main(){
    try{
        print("Enter a number:")
        val number: Int? = readLine()?.toInt()
        if(number!=null)
            print("Capicua: ${esCapicua(number)}")
        else
            throw NullPointerException()
    }
    catch (e:NullPointerException){
        println("Error Null")
    }
}

fun esCapicua(number:Int):Boolean{
    val numberList:List<String> = number.toString().split("")
    return numberList == numberList.reversed()
}
