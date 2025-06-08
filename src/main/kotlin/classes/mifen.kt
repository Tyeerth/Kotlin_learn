package classes

/**
 * @Author tyeerth
 * @Date 2025/6/5 22:44
 *
 * @Description 密封类一个类只能有有限的几种子类，而不能有任何其他类型的子类。
 *与枚举的区别
相同点：所有成员都属于本类本身

不同点：枚举只能有一个实例，而密封类的子类可以有多个实例。

 */
fun main(){

}
sealed class AA {
    abstract fun eat()
}
fun handler(a:AA){
    when(a){ // 和枚举类似,必须要实现密封类的所有子类
        is Achild -> a.eat()
        is Achild1 -> a.eat()
        else -> {}
    }
}
object BB :AA() {
    override fun eat() {
        TODO("Not yet implemented")
    }
}

class Achild:AA(){
    override fun eat() {
        println("Not yet implemented")
    }
}
class Achild1:AA(){
    override fun eat() {
        println("1 Not yet implemented")
    }
}