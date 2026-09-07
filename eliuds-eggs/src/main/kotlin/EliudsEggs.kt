object EliudsEggs {

    fun eggCount(number: Int): Int{
        var eggCount = 0
        var digit = number
        while (digit != 0) {
            if ((digit and   1) == 1)
                eggCount++
            digit = digit ushr 1
        }
        return eggCount
    }
}
