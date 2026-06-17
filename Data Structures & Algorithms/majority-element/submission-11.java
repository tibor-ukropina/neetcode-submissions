class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();


        if(nums.length == 1){
            return nums[0];
        }

        for(int num: nums){


            if(counter.containsKey(num)){
                counter.put(num, counter.getOrDefault(num, 0) + 1);
                if (counter.get(num) > (nums.length/2)){
                    return num;
                }
            }
            else{
                counter.put(num, 1);
            }
        }

        return 0;
    }
}