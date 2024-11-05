// How many collections are created while running the code below?
// What can you do to reduce the number of collection allocations while preserving the structure and semantics of the code?

fun main() {
    val list = listOf(1, 2, -3)
    val maxOddSquare = list.map { it * it }.filter { it % 2 == 1 }.max()
    println(maxOddSquare)

    // In this case, 2 intermediate collections are created
    // map - creates 1st intermediate collection = [1, 4, 9]
    val squares = list.map { it * it }
    // filter - creates 2nd intermediate collection = [1, 9]
    val odds = squares.filter { it % 2 == 1 }

    // to avoid creating intermediate collections when chaining, use asSequence
    val list2 = listOf(1, 2, -3)
    val maxOddSquare2 =  list2.asSequence()
        .map { it * it }
        .filter { it % 2 == 1 }
        .max()
    println(maxOddSquare2)
}