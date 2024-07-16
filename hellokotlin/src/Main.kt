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
    println("counter is $counter")

    // other shorthand notation
    // such as counter *= 2
    





}