class Solution {
    fun isPalindrome(x: Int): Boolean {
        var x = x
        if ( x < 0) return false
        else if (x < 10) return true
        else if (x%10 == 0) return false

        var reversed = 0
        while (x > reversed) {
            reversed = reversed * 10 + x % 10
            x /= 10
        }

        return x == reversed || x == reversed / 10
    }
}