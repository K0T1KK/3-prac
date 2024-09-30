fun main()
{
    println("3.8")
    println("Введите расстояние в километрах и футах:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = b * 0.305

    if (a< c)
    {
        println("Расстояние в километрах меньше.")
    }

    else
    {
        println("Расстояние в футах меньше.")
    }

    println()
    println("3.9")
    println("Введите два целых числа m и n:")
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    if (m % n == 0)
    {
        println("m / n = ${m / n}")
    }

    else
    {
        println("m на n нацело не делится")
    }

    println()
    println("3.10")
    println("Введите числа a и b:")
    val d = readLine()!!.toInt()
    val e = readLine()!!.toInt()

    if (e % d == 0)
    {
        println("$d является делителем $e")
    }
    else
    {
        println("$d не является делителем $e")
    }

}