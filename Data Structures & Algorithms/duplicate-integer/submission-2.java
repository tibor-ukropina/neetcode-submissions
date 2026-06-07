class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> keyTable = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){

            if(keyTable.containsKey(nums[i])){
                return true;
            }
            else{
                keyTable.put(nums[i], i);
            }
        }

        return false;
    }
}