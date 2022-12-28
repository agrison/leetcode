class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val all = IntArray(nums1.size + nums2.size)
        System.arraycopy(nums1, 0, all, 0, nums1.size);
        System.arraycopy(nums2, 0, all, nums1.size, nums2.size);
        Arrays.sort(all)

        return if (all.size % 2 == 0) {
            val mid = all.size / 2
            (all[mid] + all[mid - 1]) / 2.0
        } else {
            val mid = (all.size - 1) / 2
            all[mid].toDouble()
        }
    }
}