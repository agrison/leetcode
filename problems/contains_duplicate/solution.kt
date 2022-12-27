class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var hash = mutableSetOf<Int>()
        for (n in nums) {
            if (n in hash) 
                return true
            hash.add(n)
        }
        return false
    }
}