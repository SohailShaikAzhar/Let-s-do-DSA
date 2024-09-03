import java.util.HashMap;
import java.util.Map;

public class Solution 
{
    public static boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length()) 
        {
            return false;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) 
        {
            charCountMap.put(s.charAt(i), charCountMap.getOrDefault(s.charAt(i), 0) + 1);
            charCountMap.put(t.charAt(i), charCountMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int count : charCountMap.values()) 
        {
            if (count != 0) 
            {
                return false;
            }
        }

        return true;
    }
}
