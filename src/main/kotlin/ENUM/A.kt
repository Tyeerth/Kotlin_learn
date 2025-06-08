package ENUM

/**
 * @Author tyeerth
 * @Date 2025/6/3 21:34
 *
 * @Description
 */
fun main(){
    println(A.TEST1.print())
}
enum class A(val key:String="123"):  MAIN{
    TEST1("test1"){
        override fun print() {
            println("test1")
            TODO("Not yet implemented")
        }

    }
}
interface MAIN{
    fun print()
}