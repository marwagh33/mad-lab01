package tz.ac.suza.hellosuza
fun main() {

    // 1. Variables & Types
    val name = "Marwa"
    val age = 21
    println("My name is $name and I am $age years old.")


    // 2. Function — Area of a Rectangle
    fun area(width: Double, height: Double): Double {
        return width * height
    }
    println("Area = ${area(3.0, 4.0)}")



    // 3. Control Flow — Grade Calculator
    fun grade(score: Int): String {
        return when {
            score >= 80 -> "A"
            score >= 70 -> "B"
            score >= 60 -> "C"
            score >= 50 -> "D"
            else -> "F"
        }
    }



    // 4. Loop — FizzBuzz
    for (i in 1..30) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }



    // 5. List Operations
    val nums = listOf(1, 2, 3, 4, 5, 6)
    println("Sum = ${nums.sum()}")

    val evenNumbers = nums.filter { it % 2 == 0 }
    println("Even numbers = $evenNumbers")

    val doubledNumbers = nums.map { it * 2 }
    println("Doubled numbers = $doubledNumbers")



    // 6. Classes
    val courses = listOf(
        Course("PT822", "Visual Base", 10),
        Course("WT822", "Advance Web Development", 10),
        Course("MT822", "Mobile App Development", 12)
    )

    println("Courses:")
    courses.forEach {
        println(it)
    }



    // 7. Null Safety
    print("Enter your name: ")
    val fname: String? = readLine()

    // ?. This is called safely calls operator,it used when you want to access something only if the value is not null.
    // ?: This is called Elvis operator,it is Use it when you want to give a default value if something is null
    println("Length = ${fname?.length ?: 0}")
}


// 6. Class
class Course(
    val code: String,
    val title: String,
    val credits: Int
) {

    override fun toString(): String {
        return "[$code] $title ($credits)"
    }
}
