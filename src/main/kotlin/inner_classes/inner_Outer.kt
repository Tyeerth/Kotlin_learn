package inner_classes

/**
 * @Author tyeerth
 * @Date 2025/6/1 20:07
 *
 * @Description
 */
class inner_Outer {
 private val bar: Int = 1
 //内部类相当于一个属性
 inner class Inner {
  fun foo() = bar
 }
}
val demo1 = inner_Outer().Inner().foo() // == 1
