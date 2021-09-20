class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        int s = 0;
        int max = 0; 
        for(int i=0;i<n;i++)
        {
            if (s == 0)
                max = nums[i];
            if( max == nums[i])
                s++;
            else
               s--; 
                
        }
        return max;
    }
}