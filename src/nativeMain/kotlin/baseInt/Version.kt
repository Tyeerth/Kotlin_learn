data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val persons = listOf(
        Person("Jack", 35), Person("David", 30),
        Person("Jack", 25)
    )
    println(persons.sortedWith(compareBy(Person::name, Person::age)))

    val numbers = mutableMapOf<Int, Int>();
    for ((k, v) in numbers) {
        println("Key = $k, Value = $v")
    }
    // Or
    numbers.forEach { (k, v) -> println("Key = $k, Value = $v") }
    val numbers1 = listOf(null, 1, "two", 3.0, "four")
    println("All String elements in upper case:")
    numbers1.filterIsInstance<String>() // 明确指定我们只想保留String类型的元素
        .forEach {
            println(it.uppercase()) // 将每个字符串转换为大写
        }


}