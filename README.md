# Demo: Using Kotlin's notNull Property Delegate

Demonstrates how you can handle the case where you want to declare a Kotlin property as not being `nullable` but not specify a value at declaration time.

The approach used here is to use the `Delegates.notNull` property delegate which returns a property delegate for a read/write property with a non-`null` value that is not initialised during object construction.

Two JUnit 5 tests are provided demonstrating that:

- an exception is thrown if the property is accessed prior to initialisation; and
- the value can be accessed as usual once the property has been initialised.
