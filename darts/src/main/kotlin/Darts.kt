object Darts {

    fun <T: Any> Square(value: T): Int {
        return when(value) {
                    is Int -> value * value
                    is Double -> value * value
                    is Float -> value * value
                    is Long -> value * value
                    else ->  0
                }.toInt()
    }
    fun score(x: Any, y: Any /* choose proper types! */): Int {
        val location = Square(x) + Square(y)
        return when {
            location <= 1 -> 10
            location <= 25 -> 5
            location <= 100 -> 1
            else -> 0
        }
    }
}
