//  Simplify the following code using auxiliary functions (with, let, run, apply, also) according to the Kotlin style guide:
/*
fun main() {
    y.let {
        it.first = 1
        it.second = 2
        it.third = 3
    }
    x?.let {
        with(it) {
            start()
            finish()
        }
    }
    val result = with(z) {
        init()
        this
    }
}
 */

// Create classes for y, x, and z
class Y {
    var first: Int = 0
    var second: Int = 0
    var third: Int = 0
}

class X {
    fun start() {
        println("start")
    }
    fun finish() {
        println("finish")
    }
}

class Z {
    fun init() {
        println("init")
    }
}

fun main() {
    // create 'y' instance and apply new properties
    val y = Y()
    y.apply {
        first = 1
        second = 2
        third = 3
    }
    println(y)

    // create 'x' instance, check for null, and run functions for this instance
    val x = X()
    x?.run {
        start()
        finish()
    }

    // create 'z' instance
    val z = Z()
    // create val that apply init() function from z and return z itself
    val result = z.apply {
        init()
    }
    println(result)
}