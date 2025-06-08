package baseInt


class number {
    val one = 1
    val threeBillion = 3000
    val oneLong = 1L // Long

    val pi = 3.14          // Double
    val oneDouble = 1.0    // Double
    val eFloat = 2.7182818284f    // Float，实际值为 2.7182817
    fun main() {
        //sampleStart
        fun printDouble(x: Double) {
            print(x)
        }

        val x = 1.0
        val xInt = 1
        val xFloat = 1.0f

        printDouble(x)

//    printDouble(xInt)
        // 参数类型不匹配

//    printDouble(xFloat)
        // 参数类型不匹配
//sampleEnd

        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010
        val bigFractional = 1_234_567.7182818284
        val b: Int = 1000
        println(b)
        val byte1: Byte = 1
        val intConvertedByte: Int = bytes.toInt()
        val b11: Long? = 111   // Implicit conversion yields a boxed Long (java.lang.Long)

        // Hypothetical code, does not actually compile:
//    val a: Int? = 1    // A boxed Int (java.lang.Integer)
//    val b: Long? = a   // Implicit conversion yields a boxed Long (java.lang.Long)
//    print(b == a)      // Prints "false" as Long.equals() checks not only the value but whether the other number is Long as well
        fun test() {
            val Integer: Int? = null

        }

    }
}