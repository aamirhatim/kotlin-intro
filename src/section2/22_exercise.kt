package section2

import kotlin.collections.iterator

fun main() {
    val year = 2026
    val isLeapYear = year % 4 == 0
    val months = mapOf<String, Int>(
        "Jan" to 31,
        "Feb" to if (isLeapYear) 29 else 28,
        "Mar" to 31,
        "Apr" to 30,
        "May" to 31,
        "Jun" to 30,
        "Jul" to 31,
        "Aug" to 31,
        "Sep" to 30,
        "Oct" to 31,
        "Nov" to 30,
        "Dec" to 31
    )

    for (month in months) {
        println("${month.key}: ${month.value}")
    }
}