fun main()
{
    println("3.5")
    println("Введите три стороны треугольника:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a + b > c && a + c > b && a+ b > a)
    {
        println("Треугольник существует")
    }
    else
    {
        println("Треугольник не существует")
    }

    println()
    println("3.6")
    println("Введите год:")
    val d = readLine()!!.toInt()
    val e = (d % 4 == 0 && d % 100 != 0) || (d % 400 == 0)

    if (e)
    {
        println("$d- високосный год, 366 дней")
    }
    else
    {
        println("$d - не високосный год, 365 дней")
    }

    println()
    println("3.7")
    println("Введите два различных вещественных числа:")
    val g = readLine()!!.toDouble()
    val t = readLine()!!.toDouble()
    println("Большее: ${maxOf(g, t)}")
    println("Меньшее: ${minOf(g, t)}")
}