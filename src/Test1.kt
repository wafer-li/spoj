import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * This is the Test1 file
 *
 * Just sum the two int.
 *
 * Here I am using the functional way
 *
 * Using fold will gain more efficiencies
 *
 * @author Wafer Li
 * @since 17/4/28 04:25
 */

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    reader.useLines {
        val result = it.fold(0) { acc: Int, s: String ->
            acc + s.toInt()
        }

        println(result)
    }
}
