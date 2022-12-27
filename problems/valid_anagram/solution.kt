class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        var cs = mutableMapOf<Char, Int>()
        var ct = mutableMapOf<Char, Int>()

        for (i in s.indices) {
            cs[s[i]] = 1 + cs.getOrDefault(s[i], 0)
            ct[t[i]] = 1 + ct.getOrDefault(t[i], 0) 
        }
        
        return cs == ct
    }
}