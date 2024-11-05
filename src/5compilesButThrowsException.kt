// Write the code that compiles fine but throws an exception after you assign
// a value of type MutableList<Int?> into a variable of type MutableList<Int>
// (you can perform such an assignment with a warning using a cast).

fun main() {
    val lizaNumbersNullable: MutableList<Int?> = mutableListOf(8, 13, null, 23, 34)
    val lizaNumbers = lizaNumbersNullable as MutableList<Int>


    for (item in lizaNumbers) {
        println(item + 1)
    }
}