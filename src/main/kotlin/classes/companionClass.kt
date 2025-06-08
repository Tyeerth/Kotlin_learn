package classes

/**
 * @Author tyeerth
 * @Date 2025/6/3 21:02
 *
 * @Description kotlin使用伴生类来代替static关键字
 * 主要用于Java调用kotlin代码
 */
fun main(){
    A.foo()
    A.A2.foo()
}
open class A(){
    companion object A2{//可以不写类明，默认类名为A2
        @JvmStatic // 添加这个注解，就可以使用静态方法

        fun foo() {
            TODO("Not yet implemented")
        }
        //const只能加在不可变的基本数据类型，
        const val a = 1 //声明静态常量

        @JvmField
        val b = 2
    }

    open fun eat() {}
}
