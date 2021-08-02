class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0, globalMax = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max += nums[i];
            globalMax = Math.max(max,globalMax);
            if(max<0) max = 0;
        }
        return globalMax;
    }
}