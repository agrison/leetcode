class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        ans[0] = 1

        for (i in 0 until nums.size - 1)
            ans[i + 1] = ans[i] * nums[i]

        for (i in nums.size - 2 downTo 0) {
            ans[i] *= nums[i + 1]
            nums[i] *= nums[i + 1]
        }

        return ans
    }
}