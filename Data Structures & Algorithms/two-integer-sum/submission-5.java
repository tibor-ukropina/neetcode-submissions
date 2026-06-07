class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyValues = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){

            if(keyValues.containsKey(target - nums[i])){

                return new int[]{keyValues.get(target - nums[i]), i};

            }
            keyValues.put(nums[i], i);
        }

        return null;
    }
}
