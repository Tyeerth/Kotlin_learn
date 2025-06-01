package classes

open class Rectangle1 {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}
class FilledRectangle : Rectangle1() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }
//这表示 fillColor 是一个普通属性，在对象初始化时就确定值，而不是每次访问时都计算。使用 get() 的方式意味着每次访问
// fillColor 时都会执行 get() 中的逻辑（例如可能返回不同值）
    val fillColor: String get() = super.borderColor
}
fun main() {
    val rectangle = FilledRectangle()
    rectangle.draw()
    println(rectangle.fillColor)
}
fun double(x: Int): Int {
    return 2 * x
}
fun printHello(name: String?) {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` 或者 `return` 是可选的
}
fun double1(x: Int): Int = x * 2 //当函数体由单个表达式构成时，可以省略花括号并且在 = 符号之后指定代码体即可：


