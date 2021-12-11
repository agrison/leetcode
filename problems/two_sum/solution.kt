class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hash = hashMapOf<Int, Int>()
        val result = IntArray(2)
        for (i in nums.indices) {
            val comp = target - nums[i]
            if (comp in hash) {
                result[0] = i
                result[1] = hash[comp]!!
                return result
            }
            hash[nums[i]] = i
        }

        return result
    }
}