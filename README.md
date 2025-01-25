# Kotlin List vs MutableList: removeIf() Gotcha

This example demonstrates a common error in Kotlin related to the use of the `removeIf` function with immutable and mutable lists.  The `removeIf` function modifies the list in place; therefore, it only works with mutable lists (e.g., `MutableList`).  Attempting to use it with an immutable list (e.g., `List`) results in a compile-time error.

The provided code shows how to correctly use `removeIf` with a `MutableList` and illustrates the error that occurs when attempting to use it with a `List`.