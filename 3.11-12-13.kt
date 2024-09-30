fun main() {
    println("3.11")
    println("Введите натуральное число:")

    val a = readLine()!!.toInt()
    val b = a % 2 == 0
    val c = a % 10 == 7

    println("Число четное: $b")
    println("Число оканчивается на 7: $c")

    println()
    println("3.12")
    println("Введите двузначное число:")

    val d = readLine()!!.toInt()
    val e = d / 10
    val f = d % 10

    println("Большеe: ${maxOf(e, f)}")
    println("Одинаковы ли цифры: ${e == f}")


    println()
    println("3.13")
    print("Введите четырех значное число:")
    val n = readLine()!!.toInt()
    val s = n.toString()
    val n1 = s[0].digitToInt()
    val n2 = s[1].digitToInt()
    val n3 = s[2].digitToInt()
    val n4 = s[3].digitToInt()
    val n12 = n1 + n2
    val n34 = n3 + n4
    val n1234 = n1 + n2 + n3 + n4
    val ny = n1 * n2 * n3 * n4

    val r = n12 == n34
    println("Сумма двух первых цифр равна сумме двух последних: $r")

    val k= n1234 % 3 == 0
    println("Сумма цифр кратна трем: $k")

    val h = ny % 4 == 0
    println("Произведение цифр кратно четырем: $h")

    val g = readLine()!!.toInt() // Замените это число на любое значение, с которым нужно сравнить произведение
    val m = ny % g == 0
    println("Произведение цифр кратно числу $g: $m")

}

