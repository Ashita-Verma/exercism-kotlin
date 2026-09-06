object Bob {
    fun hey(input: String): String {
        val statement = input.trim()
        return when  {
            statement.isEmpty() -> "Fine. Be that way!"
            statement.contains(Regex("[A-Z]+")) && statement.compareTo(statement.uppercase()) == 0 -> {
                if (statement.endsWith("?"))
                    "Calm down, I know what I'm doing!"
                else
                    "Whoa, chill out!"
            }
            statement.endsWith("?") -> "Sure."
            else -> "Whatever."
        }
    }
}
