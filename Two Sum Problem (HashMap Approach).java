class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> HM = new HashMap<>();
        int temp;
        for(int i = 0; i<nums.length; i++)
        {
            if(HM.containsKey(target - nums[i]))
            {
                return new int[] {HM.get(target - nums[i]), i};
            }
            HM.put(nums[i], i);
        }
        return null;
    }
}
