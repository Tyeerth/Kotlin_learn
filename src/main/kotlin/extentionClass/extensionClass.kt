package extentionClass

/**
 * @Author tyeerth
 * @Date 2025/6/6 15:27
 *
 * @Description 对一个类或接口扩展新功能而无需继承该类
 * 用于第三方jar包，可以引入额外扩展
 */
//为 MutableList 添加一个swap 函数：
//fun MutableList.swap(index1: Int, index2: Int) {
//    val tmp = this[index1]
//    this[index1] = this[index2]
//    this[index2] = tmp
//}
class Jump{
    fun test(){
        println("Jump")
    }
}
fun Jump.test(str:String){
    println("Jump1")
}
fun main() {
    val list = mutableListOf(1, 2, 3)
    println(list)
    Jump().test("hello")
}