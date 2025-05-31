package control

class if_used {
    fun main() {
        val a = 1
        val b = 2
        val max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
    }

    fun switch() {
        val x = 2
        val a = 1
        val b = 2
        when (x) { // 类似与switch
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> print("x is neither 1 nor 2")
        }
        val message = when {
            a > b -> "a is greater than b"
            a < b -> "a is less than b"
            else -> "a is equal to b"
        }
    }
}