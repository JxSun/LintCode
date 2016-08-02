public class Solution {
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0) return;
        
        reverse(str, 0, str.length - 1);
        reverse(str, 0, (offset % str.length) - 1);
        reverse(str, offset % str.length, str.length - 1);
    }
    
    private void reverse(char[]str, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char tmp = str[i];
            str[i] = str[j];
            str[j] = tmp;
        }
    }
}