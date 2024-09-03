import java.util.HashSet;
import java.util.Set;

class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        Set<Integer> HS = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(HS.contains(nums[i]))
            {
                return true;
            }
            HS.add(nums[i]);
        }
        return false;
    }
}
