class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        if (nums == null)
            return resultList;

        Arrays.sort(nums);
        
        ArrayList<Integer> path = new ArrayList<>();
        generateSet(nums, 0, path, resultList);
        return resultList;
    }
    
    private void generateSet(int[] nums,
                             int start,
                             ArrayList<Integer> sub,
                             ArrayList<ArrayList<Integer>> subs) {
        subs.add(new ArrayList<Integer>(sub));
        for (int i = start; i < nums.length; i++) {
            sub.add(nums[i]);
            generateSet(nums, i + 1, sub, subs);
            sub.remove(sub.size() - 1);
        }
    }
}