package classes

class Person(
    val firstName: String="str",
    val lastName: String,
    var age: Int, // 尾部逗号
) {
    var name: String = lastName//

    // 辅助构造函数1：只传年龄
    constructor(age: Int) : this(firstName = "default", lastName = "default", age = age)

    // 辅助构造函数2：无参构造函数
    constructor() : this("Alice", "Smith", 0)
}
fun main() {
    val person = Person("Alice", "Smith", 30)
    println(person.firstName)
    val person1 = Person()
    println(person1.age)
    println(person.lastName)
    println(person.age)
}