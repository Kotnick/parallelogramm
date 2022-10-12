fun main(args: Array<String>) {
    println("Для расчета объема параллелограмма введите его параметры:")
    println("Введите значение высоты")
    val height = readln()!!.toInt()
    println ("Введите значение ширины")
        val width = readln()!!.toInt()
    println("Введите значение длины")
    val length = readln()!!.toInt()
    println("При значенях высоты $height, ширины $width, длины $length")
    println("Получается следующее значение объема параллелограмма:")
    val result = height*width*length
    println(result)


}