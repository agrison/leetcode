class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = mutableMapOf<Int, Int>()
        val bucket = Array(nums.size + 1) { mutableListOf<Int>() }

        for (num in nums)
            count.merge(num, 1) { a, b -> a + b }

        for (key in count.keys) {
            val freq = count[key]!!
            bucket[freq].add(key)
        }

        var index = 0
        val ans = IntArray(k)
        for (i in nums.size downTo 0) {
            for (v in bucket[i]) {
                ans[index++] = v
                if (index == k)
                    return ans
            }
        }

        return ans
    }
}