object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if (start < 1)
            throw IllegalArgumentException()

        var count = 0
        var newNumber = start
        while (newNumber != 1) {
            newNumber = if (newNumber.mod(2) == 0)
                            newNumber /2
                         else (newNumber * 3) + 1
            count++
        }
        return count
    }
}
