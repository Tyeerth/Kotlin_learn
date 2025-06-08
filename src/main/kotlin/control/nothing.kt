package control

/**
 * @Author tyeerth
 * @Date 2025/5/31 20:20
 *
 * @Description
 */
class nothing {
 class Person(val name: String?)

 fun fail(message: String): Nothing {//Nothing来标记尚未实现或设计为始终抛出异常的函数
  throw IllegalArgumentException(message)
  // This function will never return successfully.
  // It will always throw an exception.
 }

 fun main() {
  // Creates an instance of Person with 'name' as null
  val person = Person(name = null)

  val s: String = person.name ?: fail("Name required")

  // 's' is guaranteed to be initialized at this point
  println(s)
 }
}