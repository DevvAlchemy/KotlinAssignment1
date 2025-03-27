class  Challenges {
    //A) Function to sum integers from 1 to max
    fun sumToMax(max: Int): Int {
        //ensuring input is a positive Number only
        if (max < 1) {
            println("Please put a positive number.")
            return 0
        }
        //using iteration to sum the numbers
        var sum = 0
        for (i in 1..max) {
            sum += 1
        }
        return sum
    }

    // B) Iterating factorial func
    fun  findFactorial(n: Int): Long {
        if (n == 0 || n == 1)
            return 1
        var result: Long = 1
        for (i in 2 ..n) {
            result += i
        }
        return result
    }

    // C) Lambda expression
    val factorialLambda: (Int) -> Long = { n ->
        when {
            n < 0 -> {
                println("Error factprrial not defined for  negative numbes.")
                0
            }
            n == 0 || n == 1 -> 1
            else -> (2..n).fold(1L) { acc, i -> acc * i }
        }
    }

    // D) Recursive Factorial Func
    fun recursiveFactorial(n: Int): Long {
    return when {
        n < 0 -> {
            println("Error factprrial not defined for  negative numbes.")
            0
        }
        n == 0 || n == 1 -> 1
            else -> n * recursiveFactorial(n-1)
        }
    }
}

// Main function to demonstrate the implementations
fun main() {
    val challenges = Challenges()

    // Demonstrating sum to max
    println("Sum to 10: ${challenges.sumToMax(10)}")

    // Demonstrating iterative factorial
    println("Factorial of 5 (iterative): ${challenges.findFactorial(5)}")

    // Demonstrating lambda factorial
    println("Factorial of 5 (lambda): ${challenges.factorialLambda(5)}")

    // Demonstrating recursive factorial
    println("Factorial of 5 (recursive): ${challenges.recursiveFactorial(5)}")
}