//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
const val outsideConst: Double = 5.236

fun main() {
    val name: String = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!") // print greeting

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i") // in Swift "1 = /(i)"
    }

    println(24 / 3)
    println(1 / 2)
    println(1.0 / 2.0)
    println(1.0 / 2)
    println(1 / 2.0)
    println(5 + 3 * 4 * 2 - 6 / 3 + 1)
    // 5 + 12 * 2 - 6 / 3 + 1
    // 5 + 24 - 6 / 3 + 1
    // 5 + 24 - 2 + 1 = 28

    var num1: Int = 5 // valid as 5 is an integer

    // var num2: Int = 5.0 // not valid as 5.0 is NOt an integer

    var num3 = 5 // num3 assumes the data type integer
                 // because 5 is an integer

    var num4 = 5.0 // num4 assumes the data type double
                   // because 5.0 is a floating point number
                   // in this case double is assumed

    var num5: Float = 5.0F // num5 is type Float

    var counter: Int = 0

    counter += 1 //means counter = counter + 1
    // counter = 1
    println("counter is $counter")
    counter++ // increments by 1
    println("counter is $counter")
    counter -= 1 // means counter = counter - 1
    // counter = 0
    println("counter is $counter")

    counter-- // decrements by 1

    var integer: Int = 100
    println("integer is $integer")
    var decimal: Double = 12.8
    println("decimal is $decimal")
    integer = decimal.toInt()

    println("integer is $integer")

    // other shorthand notation
    // such as counter *= 2

    var x:Double = 5.2
    var y:Int = 3

    var z = y + x
    println("z is $z")

    val bigString = """
  |You can have 
  |a string
  |that contains multiple
  |lines
  |another test
  |by
  |doing this.
  """.trimMargin()
    println(bigString)

   val newString = "Hello\nMyname is\nJoe"


   println(newString)

    val alsoTrue = !(1 == 2) // ! means not
    println(alsoTrue)

    var sum: Int = 0
    while (sum < 100) {
        sum = sum + sum + 1
        println(sum)
    }

    val number = 0

    when (number) {
        0 -> println("Zero")
        else -> println("Non-zero")
    }

    printMyName("Daffy", "Duck") // calling the function
    printMyName()

    var result: Int? = null
    // var resultPlusOne = result + 1

    var nullableResult: Int?
    var nonNullableResult: Int = 0

    if (result != null)
    {
        nonNullableResult = result
    }
    else
    {
        nullableResult = result
    }

    println(nonNullableResult + 1)

    var result2: Int? = 10
    var mustHaveResult = result2 ?: 0
    println(mustHaveResult + 1)

    var items = arrayOf(5, 3, 7, 2)
    println(items[2])

    val vowels = Array(5, {2})
    println(vowels[4])
    println(vowels[0])
    vowels[4] = 7
    println(vowels[4])

    val items2 = arrayOf(5, 3.47, "Fred", "Joe")
    println(items2[1])
    println(items2[3])

    for(item in items2)
    {
        println(item)
    }

    items2.forEach { item ->
       println(item)
    }

    //val courses = mutableListOf("Android")

    val courses: MutableList<String> = mutableListOf()

    courses.add("Android")
    courses.add("IOS")
    courses.add("Java")
    courses.add(1, "Data Modelling")

    println(courses.first())
    println(courses.last())
    println(courses[1]) // should be Data Modelling

    var index: Int = courses.indexOf("Data Modelling")
    courses.removeAt(index)
    println(courses[1]) // should be IOS

    for (course in courses)
    {
        println(course)
    }

    courses.forEach { course ->
        println(course)
    }

    println(fibonacci(5))
    println(fibonacci(7))
    println(fibonacci(10))


}

fun printMyName(firstName: String = "Bugs", lastName: String = "Bunny") { // defining the function
    println("My name is $firstName $lastName.")
}

fun fibonacci(number: Int): Int
{
    if (number <= 0)
    {
        return 0
    }
    if (number == 1 || number == 2)
    {
        return 1
    }
    return fibonacci(number - 1) + fibonacci(number - 2)
}













