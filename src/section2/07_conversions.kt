package section2

fun main() {
//    Converting from one type to another
    val cats = 3
    val longCats = cats.toLong()

    println("Converted cats:${cats} (${cats::class.java}) to longCats:${longCats} (${longCats::class.java})")

//    Come sonversions can corrupt the data in the variable
    var fl = 2.99F
    var int = fl.toInt()

    println("${fl} --convert--> ${int}")
}