object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
       return buildMap {
           source.forEach { points, chars ->
               chars.forEach { _char ->
                  put ((_char.code or 32).toChar(), points)
               }
           }
       }
    }
}
