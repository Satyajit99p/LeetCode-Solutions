class Solution {
    public int repeatedNTimes(int[] nums) {

        int x=0;
        int[] dummy = new int[10000];
        for(int i : nums)
        {
            if(dummy[i]++ == 1)
            {
                x = i;
                break;
            }
        }
        return x;
    }
}