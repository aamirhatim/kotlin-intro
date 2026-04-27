fun main() {
    // Catching exceptions
    var txt = "abc"
    try {
        println(txt.toInt())
    } catch (e: Exception) {
        println("Exception on Int conversion: ${e.message}")
    } finally {
        println("finally")
    }

    // Creating your own exception
    if (txt != "123") {
        throw Exception("Input is not 123")
    }
}