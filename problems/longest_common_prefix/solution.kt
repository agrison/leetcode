import java.lang.StringBuilder

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        strs.sort()

        val result = StringBuilder()
        strs.first().zip(strs.last()).forEachIndexed { i, (c1, c2) ->
            if (c1 != c2) return result.toString()
            result.append(c1)
        }

        return result.toString()
    }
}