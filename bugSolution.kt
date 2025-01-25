```kotlin
fun main() {
    val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)
    mutableList.removeIf { it > 2 }
    println("Mutable List after removeIf: $mutableList") // Output: [1, 2]

    val list = listOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it <= 2 }
    println("Immutable List after filtering: $filteredList") // Output: [1, 2]
}
```