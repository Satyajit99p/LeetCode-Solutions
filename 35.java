class Solution {
    
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || target < nums[i]) {
                return i;
            }
            else if (i < nums.length-1 && target < nums[i+1]) {
                return i + 1;
            }
        }
        return nums.length;
    }
}