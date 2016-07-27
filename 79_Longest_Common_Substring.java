public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        boolean isAShorter = A.length() < B.length();
        char[] shortArr = isAShorter ? A.toCharArray() : B.toCharArray();
        char[] longArr = isAShorter ? B.toCharArray() : A.toCharArray();
        // Space: O(min(A, B))
        int[][] C = new int[2][shortArr.length + 1];
        int max = 0;
        
        // Time: O(m*n)
        for (int i = 0; i < longArr.length; i++) {
            for (int j = 0; j < shortArr.length; j++) {
                if (longArr[i] == shortArr[j]) {
                    int length = C[(i + 1) % 2][j + 1] = 1 + C[i % 2][j];
                    if (length > max) max = length;
                } else {
                    C[(i + 1) % 2][j + 1] = 0;
                }
            }
        }
        
        return max;
    }
}