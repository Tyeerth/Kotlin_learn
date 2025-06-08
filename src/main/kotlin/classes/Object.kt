package classes

/**
 * @Author tyeerth
 * @Date 2025/6/3 21:44
 *
 * @Description object关键字主要用于单例模式
 */
fun main() {
    A1.test()
    println(A1.a)
    val danli = object : CallBack { //  基于接口的匿名对象,用于创建匿名一次性对象的对象表达式。
        override fun loading() {
            println("Callback")
        }
    }
    request(danli)
}
object A1{ //基于饿汉模式的单例模式
    val a = 1
    fun test(){
        println("test")
    }
}
fun interface CallBack{
    fun loading()
}
fun request(callBack: CallBack){
    callBack.loading()
}