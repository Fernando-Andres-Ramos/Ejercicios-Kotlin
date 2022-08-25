fun main() {
    val arrList = ArrayList<String>()
    var flag = 0

    /* Ingresar textos hasta enviar null*/
    while (flag == 0) {
        print("Ingrese un texto (envie null para detener):")
        val linea: String? = readLine()
        if (linea == null)
            flag = 1
        else
            arrList.add(linea)
    }
    val lineas: Array<String> = arrList.toTypedArray()
    println(enmarcar(lineas))

}



fun enmarcar(lineas:Array<String>):String{
    /* Variable texto a devolver y numero maximo de "*" */
    var maxLineWidth: Int = 0
    var texto: String = ""

    /* Obtengo el maximo ancho del cuadro*/
    for(linea in lineas){
        if(linea.length>maxLineWidth)
            maxLineWidth = linea.length
    }

    /* Concateno las lineas del array, con espaciados y asteriscos */
    for (linea in lineas){
        if (linea.length>maxLineWidth)
            texto += "* $linea *\n"
        else{
            var blank = ""
            var j:Int = linea.length
            while(maxLineWidth - j > 0){
                blank += " "
                j++
            }
            texto += "* $linea$blank *\n"
        }
    }

    /* Creo un string que tiene la franga superior e inferior de asteriscos */
    maxLineWidth += 4
    var marco:String = ""
    val simbol:String = "*"
    var i = 0
    while(i<maxLineWidth){
        marco += simbol
        i++
    }
    marco += "\n"


    /* Concatenar las frangas superior e inferior con el texto en medio*/
    return "$marco$texto$marco"
}