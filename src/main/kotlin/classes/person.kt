package classes

/**
 * @Author tyeerth
 * @Date 2025/6/3 19:26
 *
 * @Description
 */
open class person( val name :String = "xiaoming") {
     var a = 3
      get() = field - 2 //field  是属性的默认值
       set(value) {
          field = value + 2
      }
     var b = 4
}
class  xiaoming(): person() {
}
fun main() {
    val xiaoming = xiaoming()
    println(xiaoming.a)
    xiaoming.a = 5
    println(person().name)
}