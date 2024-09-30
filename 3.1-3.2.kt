fun main() {
    println("3.1")
    println("Введите три числа:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val max = maxOf(a, b, c)
    println("Максимальное число: $max")

    println()
    println("3.2")
    if (a == b || b == c || a == c) {
        println("Ошибка: есть равные числа.")
    } else {
        val min = minOf(a, b, c)
        val sr=a+b+c-(min+max)
        println("Среднее из чисел:$sr")
    }
}