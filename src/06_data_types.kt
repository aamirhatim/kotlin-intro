/*

Some primitive data types:
- String
- Bool
- Numbers

Types of numbers
- Byte:
    - 8 bits
    - min:max -128 : 128
- Short:
    - 16 bits
    - min:max -32768 : 32768
- Int:
    - 32 bits
    - min:max -2^32 : 2^32
- Long:
    - 64 bits
    - min:max -2^64 : 2^64
- Float:
    - 32 bits
    - 6 or 7 decimal digits
- Long:
    - 64 bits
    - 15-16 decimal digits

Implicit numbers
- Kotlin automatically decides appropriate number data type
  if not specified

 */

fun main() {
//    Implicit assignment
    var price = 12.99
    var amount = 3
    val total = price * amount

    println("Price: ${price}, ${price::class.java}")    // Prints variable type
    println("Amount: ${amount}, ${amount::class.java}")
    println("Total: ${total}, ${total::class.java}")

//    Manual assignment
    var dogs: Int = 10
    var atoms: Long = 1234566
    var molecules = 7890L   // Another way to assign Long type
    var price1: Double = 12.99
    var price2 = 2.99F      // Assign Float
    var price3: Float = 0.99F
}