class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> keyTable = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){

            if(keyTable.contains(nums[i])){
                return true;
            }
            else{
                keyTable.add(nums[i]);
            }
        }

        return false;
    }
}