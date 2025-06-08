package inner_classes

/**
 * @Author tyeerth
 * @Date 2025/6/3 20:34
 *
 * @Description
 */
class Person {
    // 内部类
    inner class Inner {
        fun getOuterReference() {
            println("inner")
        }
    }

    //嵌套类
    class InnerClass {
        fun getOuterReference() {
            println("inner class")
        }
    }
}

fun main() {
    val person = Person()
    val inner = person.Inner().getOuterReference()
    Person.InnerClass().getOuterReference()
}