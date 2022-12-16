class Solution {
    private val table = mapOf(
        'I' to 1, 'V' to 5, 'X' to 10,
        'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var (result, i) = Pair(0, 0)
        while (i < s.length) {
            val current = table[s[i]]!!
            val next = when (i+1 < s.length) {
                true -> table[s[i + 1]]!!
                else -> 0
            }
            if (next > current) {
                result += next - current
                i++
            } else {
                result += current
            }

            i++
        }
        
        return result
    }
}