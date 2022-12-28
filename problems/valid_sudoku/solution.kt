class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = board.size
        val cols = board[0].size

        for (i in 0 until rows) {
            val rowSet = mutableSetOf<Char>()
            for (j in 0 until cols) {
                if (board[i][j] != '.') {
                    if (board[i][j] in rowSet) return false
                    rowSet.add(board[i][j])
                }
            }
        }

        for (i in 0 until cols) {
            val colSet = mutableSetOf<Char>()
            for (j in 0 until rows) {
                if (board[j][i] != '.') {
                    if (board[j][i] in colSet) return false
                    colSet.add(board[j][i])
                }
            }
        }

        for (i in 0 until rows step 3)
            for (j in 0 until cols step 3)
                if (!validBlock(i, j, board))
                    return false

        return true
    }

    private fun validBlock(startX: Int, startY: Int, board: Array<CharArray>): Boolean {
        val block = mutableSetOf<Char>()
        for (i in startX until startX + 3) {
            for (j in startY until startY + 3) {
                if (board[i][j] != '.') {
                    if (block.contains(board[i][j])) return false
                    block.add(board[i][j])
                }
            }
        }
        return true
    }
}