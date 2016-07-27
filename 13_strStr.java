class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if (source == null || target == null)
            return -1;
        if (source != null && target.length() == 0)
            return 0;

        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < target.length(); j++) {
                int len = 0;
                while (i + len < source.length()
                    && j + len < target.length()
                    && source.charAt(i + len) == target.charAt(j + len))
                    len++;
                    
                if (len == target.length())
                    return i;
            }
        }
        return -1;
    }
}