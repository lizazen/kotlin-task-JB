// Implement a val property that returns a different value on each access

class RandomInt() {
    val myRandom: Int get() = (1..1000).random()
}

fun main() {
    val myCurrentRandom = RandomInt()
    println(myCurrentRandom.myRandom)
}