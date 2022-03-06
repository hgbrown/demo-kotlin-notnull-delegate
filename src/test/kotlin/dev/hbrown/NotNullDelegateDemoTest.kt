package dev.hbrown

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NotNullDelegateDemoTest {

    @Test
    internal fun `should throw expected exception when used before value is set`() {

        val e = assertThrows(IllegalStateException::class.java) {
            println(NotNullDelegateDemo().shouldNotBeNull)
        }
        assertEquals("Property shouldNotBeNull should be initialized before get.", e.message)
    }

    @Test
    internal fun `should be able to set and get value without exception`() {
        val cut = NotNullDelegateDemo()
        cut.shouldNotBeNull = "Hello, World!"

        assertDoesNotThrow { cut.shouldNotBeNull }
    }
}
