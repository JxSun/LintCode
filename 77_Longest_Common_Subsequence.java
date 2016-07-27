public class Solution {
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        int[][] C = new int[arrA.length + 1][arrB.length + 1];

        for (int i = 1; i < C.length; i++) {
            for (int j = 1; j < C[0].length; j++) {
                if (arrA[i - 1] == arrB[j - 1])
                    C[i][j] = 1 + C[i - 1][j - 1];
                else if (C[i - 1][j] > C[i][j - 1])
                    C[i][j] = C[i - 1][j];
                else
                    C[i][j] = C[i][j - 1];
            }
        }

        return C[C.length - 1][C[0].length - 1];
    }
}
