package classes

abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw()  {
        // draw the rectangle
    }
}
