fun greetUser(name: String?) {
    val length = name?.length  // Using Safe Call Operator (?.) because trying to access name.length directly will cause error

    if (name != null) {
        println("Hello, $name! Your name has $length characters.")
    } else {
        println("Hello")
    }
}
fun getAddress(): String {
    val address: String? = null  // Nullable variable (String?) assigned to null
    return address ?: "Unknown Address"  // Using Elvis operator (?:)
}
fun calculateArea(width: Int, height: Int): Int {
    require(width > 0) { "Width must be greater than 0!" }
    require(height > 0) { "Height must be greater than 0!" }

    return width * height
}
fun testNullableVsNonNullable() {
    var age: Int = 25
    // age = null will get "ERROR: Kotlin does not allow null for non-nullable types" because Int is NonNullable

    var nullableAge: Int? = 4 // using Int? will make Nullable
    nullableAge = null // Allowed because it's `Int?`

    println("Age (Non-Nullable): $age")
    println("Age (Nullable): ${nullableAge ?: "No age provided"}") // Elvis operator
}

fun main() {
    greetUser("Dalal")
    greetUser(null)

    println("User address: ${getAddress()}")
    println("Area: ${calculateArea(5, 10)}")

    testNullableVsNonNullable()
}
