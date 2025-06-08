package classes

/**
 * @Author tyeerth
 * @Date 2025/6/3 20:55
 *
 * @Description 使用了data关键字会多出基本的常用方法
 */
data class dataClass(val name:String = "xiaoming") {
}
class B(val name: String)
fun main() {
    val a = dataClass("xiaoming")
    val copy = a.copy("aaaa")
    println(copy)

    val b = dataClass("xiaoming")
    println(a == b)
    println(a.hashCode())
    println(b.hashCode())
    println(a.toString())

    println(a.component1())
    val (name) = a
    println(name)
}