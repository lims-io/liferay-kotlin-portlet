package io.lims.kotlin

// Holds list of cats
object Cats {

    // Holds list of cats names
    val names: List<String> by lazy {
        listOf("Bella", "Tigger", "Chloe")
    }
}