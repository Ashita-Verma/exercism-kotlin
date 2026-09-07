import kotlin.math.hypot

object Darts {

    fun <T: Number> Square(value: T): Double {
        return when(value) {
                    is Int -> value * value
                    is Double -> value * value
                    is Float -> value * value
                    is Long -> value * value
                    else ->  value.toDouble() * value.toDouble()
                }.toDouble()
    }
    fun score(x: Any, y: Any /* choose proper types! */): Int {
        val location = Square(x as Number) + Square(y as Number)
        return when {
            location <= 1 -> 10
            location <= 25 -> 5
            location <= 100 -> 1
            else -> 0
        }
    }
}
