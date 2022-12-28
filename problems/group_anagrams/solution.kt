class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val ans = mutableMapOf<String, MutableList<String>>()
        for (s in strs) {
            val count = CharArray(26) { ' ' }
            for (c in s)
                count[c.toInt() - 'a'.toInt()]++
            val key = count.joinToString(" ")
            if (key !in ans) 
                ans[key] = mutableListOf()
            
            ans[key]!!.add(s)
        }

        return ans.values.toList()
    }
}