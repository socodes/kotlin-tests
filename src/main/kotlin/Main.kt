import junit.framework.Assert.assertEquals
import org.junit.Test


class StringChecker {
    //function that returns the number of occurences the char in string.
    fun checkString(string: String, predicate: Char): Any {
        var occurences = 0
        string.forEach { character ->
            if(character == predicate) occurences++
        }

        return occurences
    }

}
//main test class
class StringCheckerTest {
    @Test
    fun `No occurrences`() {
        //create test data
        var testString = "Potato"
        var testChar = 'a'

        //Create real thing
        val checker = StringChecker()
        var result = checker.checkString(testString,testChar)

        //tests whether the result is passing or not
        assertEquals(result,1)
    }
}
fun main(args: Array<String>) {

}