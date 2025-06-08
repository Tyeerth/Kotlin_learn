package baseInt

class shuzu {
    fun main() {
        var riversArray = arrayOf("Nile", "Amazon", "Yangtze")

        // 使用 += 赋值操作创建了一个新的 riversArray，
        // 复制了原始元素并添加了“Mississippi”
        riversArray += "Mississippi"
        println(riversArray.joinToString())
        // Nile, Amazon, Yangtze, Mississippi
        val asc = Array(5) { i -> (i * i).toString() }

//        嵌套数组
        val twoDArray = Array(2) { Array(2) { 0 } }
        twoDArray[0][0] = 2
        println(twoDArray[0][0].toString()) // 2


        val lettersArray = arrayOf("c", "d")
        printAllStrings("a", "b", *lettersArray) //可变参数
        // abcd
    }

    fun printAllStrings(vararg strings: String) {
        for (string in strings) {
            print(string)
        }
    }

    fun compareArray() {
        val simpleArray = arrayOf(1, 2, 3)
        val anotherArray = arrayOf(1, 2, 3)

        // Compares contents of arrays
        println(simpleArray.contentEquals(anotherArray))
        // true

        // Using infix notation, compares contents of arrays after an element
        // is changed
        simpleArray[0] = 10
        println(simpleArray contentEquals anotherArray)
        // false
        //sampleEnd
    }

    //数组转为集合
    fun change() {
        val simpleArray = arrayOf("a", "b", "c", "c")
        println(simpleArray.toSet())
        val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)

        // Converts to a Map
        // The keys are fruits and the values are their number of calories
        // Note how keys must be unique, so the latest value of "apple"
        // overwrites the first
        println(pairArray.toMap())
        // {apple=120, banana=150, cherry=90}
    }

    fun testlist() {
        val numbers = mutableListOf("one", "two", "three", "four")
        numbers.add("five")            // This is OK
        val immutableNumbers = listOf("one", "two")
//immutableNumbers.add("five") // Compilation error - Unresolved reference: add
    }
}