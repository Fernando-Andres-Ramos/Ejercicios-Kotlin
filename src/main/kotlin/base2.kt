fun main(){
    try{
        print("Enter a number:")
        val number: Int? = readLine()?.toInt()
        if(number!=null)
            print("Numero $number en binario: ${base2(number)}")
        else
            throw NullPointerException()
    }
    catch (e:NullPointerException){
        println("Error Null")
    }
}

fun base2 (number:Int): String {
    val base = 2
    var aux = number
    var numberString = ""
    var flag = 0
    while(flag==0){
        numberString += (aux % base).toString()
        if(aux/base>1){
            aux /= base
        }
        else{
            numberString += (aux/base).toString()
            flag = 1
        }
    }
    return numberString.reversed()
}