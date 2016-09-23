package io.lims.kotlin

// Holds list of cats
object Cats {

    // Holds list of cats names
    val names: List<String>
    get() {
        return listOf("Bella", "Tigger", "Chloe")
    }
}