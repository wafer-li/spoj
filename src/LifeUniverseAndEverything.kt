import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * This is the LifeUniverseAndEverything File
 *
 * The solution of
 * [TEST - Life, the Universe, and Everything](http://www.spoj.com/problems/TEST/)
 * in spoj
 *
 * I've wrote two solutions down bellow.
 *
 * One is functional, and the other is the normal style.
 *
 * It turns out that the two solutions don't have much differences.
 *
 * And both of the solution use 4G space( I really don't know why. )
 *
 * But eventually they all get accepted.
 *
 * @author Wafer Li
 * @since 17/4/28 03:52
 */

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    reader.useLines {
        it.takeWhile { it != 42.toString() }.forEach(::println)
    }
}


//fun main(args: Array<String>) {
//    var answer = readLine()!!
//
//    while (answer != 42.toString()) {
//        println(answer)
//        answer = readLine()!!
//    }
//}
