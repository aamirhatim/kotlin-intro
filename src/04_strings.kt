/*
- Strings cannot have double quote ( " ) or backslash ( \ )
 */

fun main() {
    println("The answer is \"yes\"")    // backslash used as escape key
    println("Here is a backslash: \\")

//    TEMPLATES
/*
- Use ${varName} inside quotes to print variables
 */
    var cat = "Pip"
    var cat2 = "Billie"
    println("My cat's name is ${cat}")          // Template method
    println("My other cat's name is " + cat2)   // Non-template way to include vars in print lines

//    STRING FUNCTIONS
    /*
    - Strings have functions like length, uppercase, lowercase, trim, etc.
     */
    println("cat length: ${cat.length}")
    println(cat2.uppercase())
}