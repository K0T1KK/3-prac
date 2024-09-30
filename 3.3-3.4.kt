fun main()
{
    println("3.3")
    println("Введите два числа с разной четностью:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    if ((a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0))
    {
        val c = if (a % 2 != 0) a else b
        println("Нечетное число: $c")
    }

    else
    {
        println("Числа должны иметь разную четность.")
    }

    println()
    println("3.4")
    println("Введите большее и меньшее число:")
    val d = readLine()!!.toInt()
    val e = readLine()!!.toInt()

    if (d % e == 0)
    {
        println("$d кратно $e")
    }

    else
    {
        val f = d % e
        println("$d не кратно $e, остаток от деления: $f")
    }

}