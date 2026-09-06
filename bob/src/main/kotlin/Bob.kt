object Bob {
    fun hey(input: String): String {
        return when  {
            input.matches(Regex("^[A-Z ]+(?<=\\?)$")) -> "Calm down, I know what I'm doing!"
            input.matches(Regex("^(?!.*\\?)[A-Z ]+$")) -> "Whoa, chill out!"
            input.endsWith('?') -> "Sure."
            input.isEmpty() -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }
}
