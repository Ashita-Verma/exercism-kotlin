object Isogram {

    fun isIsogram(input: String): Boolean {
        var seenMask = 0

        for (i in 0 until input.length){
            val offset = (input[i].code or 32) - 97
            if (( offset < 0) || (offset > 25)) continue
            val bit = 1 shl offset
            if ((seenMask and bit) != 0){
                return false
            }
            seenMask = seenMask or bit
        }
        return true
    }
}
