/**
 * The 42 Interactive
 *
 * The solution of
 * [EXPECT - Life, the Universe, and Everything (Interactive)](http://www.spoj.com/problems/EXPECT/)
 *
 * Just the interactive version of the 42 problem
 *
 * Read the input, and check if it is 42.
 *
 * If so, print out the input and terminate the program
 *
 * @author Wafer Li
 * @since 17/4/28 16:25
 */

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()
        println(input)

        if (input == 42.toString())
            break
    }
}