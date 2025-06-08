package ENUM

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
enum class ProtocolState {
    WAITING {
        //WAITING 是枚举的一个实例，它重写了 signal() 方法，返回 TALKING。
        //表示：当当前状态是 WAITING 时，调用 signal() 会切换到 TALKING。
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING //返回一个枚举常量
    };

    abstract fun signal(): ProtocolState
}
fun main() {
    println(Direction.EAST)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.name)
println(ProtocolState.TALKING.signal())
}