import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SampleTest {

    @Test
    fun stupidTest() {
        val sample = Sample("hello")
        assertEquals("hello", sample.text)
    }

    @Test
    fun anotherStupidTest() {
        val sample = Sample("holla")
        assertEquals("holla", sample.text)
    }
}