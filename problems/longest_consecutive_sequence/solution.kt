import kotlin.math.max

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        val set = mutableSetOf<Int>()
        nums.forEach { set.add(it) }

        var ans = 1
        for (i in nums.indices) {
            var num = nums[i]
            if (num - 1 !in set) {
                var count = 1
                while (num + 1 in set) {
                    num++
                    count++
                }
                ans = max(count, ans)
            }
        }
        return ans
    }
}