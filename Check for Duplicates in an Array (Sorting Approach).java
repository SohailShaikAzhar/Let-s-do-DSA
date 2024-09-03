class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        int size = nums.length;
        int temp;
        boolean ans = false;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(nums[i] > nums[j])
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i < size-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                ans = true;
            }
        }
        return ans;
    }
}
