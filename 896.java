class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean value = false;
        if (nums.length == 1)
            return true;
        else
        {
            int c=0;
            for (int i=0;i<nums.length-1;i++)
            {
                if(nums[i]<=nums[i+1])
                    continue;
                else
                {
                    c++;
                    break;
                }
            }
            if(c == 0)
                value=true;
            else
            {
                int d=0;
                for (int i=0;i<nums.length-1;i++)
            {
                if(nums[i]>=nums[i+1])
                    continue;
                else
                {
                    d++;
                    break;
                }
            }
                if(d==0)
                    value=true;
            }
        }
        return value;
    }
}