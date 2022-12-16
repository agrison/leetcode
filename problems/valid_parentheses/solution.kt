class Solution {
    val openings = setOf('(', '[', '{')
    val matching = mapOf('}' to '{', ')' to '(', ']' to '[')

    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        s.forEach { c ->
            if (c in openings)
                stack.add(c)
            else if (stack.isNotEmpty()) {
                val last = stack.last()
                if (last != matching[c]!!)
                    return false
                stack.removeAt(stack.size - 1)
            } else
                return false
        }

        return stack.isEmpty()
    }
}