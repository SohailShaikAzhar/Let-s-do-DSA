class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        int size = nums.length;
        int a, b;
        boolean ans = false;
        for(int i = 0; i < size; i++)
        {
            a = nums[i];
            for(int j = 0; j < size; j++)
            {
                if(i != j)
                {
                    b = nums[j];
                    if(a == b)
                    {
                        ans = true;
                    }
                }
            }
        }
        return ans;
    }
}
