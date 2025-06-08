package forin

/**
 * @Author tyeerth
 * @Date 2025/6/3 19:06
 *
 * @Description
 */
class interactor {
 fun main() {
  val list = listOf(1, 2, 3)
  for (item in list) {
   println(item)
  }
 }
}
fun main() {
 val list = listOf(1, 2, 3)
 for (item in list) {
  println(item)
 }
 list.forEach { println(it) }//单个参数可以直接使用it
 list.forEachIndexed { index, i ->
  println("$index  $i")


 }
}