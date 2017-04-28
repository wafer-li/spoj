import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * The PrimeGenerator
 *
 * Check 2 .. sqrt(n) if all the number in it could
 * not be totally divided.
 *
 * Then the number n is prime
 *
 * @author Wafer Li
 * @since 17/4/28 04:41
 */

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.useLines {
        it.drop(1).forEach {
            val startAndEndInclusive = it.split(" ")

            val start = startAndEndInclusive[0].toInt()
            val endInclusive = startAndEndInclusive[1].toInt()

            (start..endInclusive).filter { isPrime(it) }.forEach(::println)
            println()
        }
    }
}

fun isPrime(n: Int) = if (n <= 1) false else (2..Math.sqrt(n.toDouble()).toInt()).all { n % it != 0 }
