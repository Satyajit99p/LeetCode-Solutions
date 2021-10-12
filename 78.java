
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ar = new ArrayList();

        int n = nums.length;
        for(int i = 0; i<Math.pow(2,n);i++)
        {
            List<Integer> temp = new ArrayList();
            for(int j =0;j < n;j++)
            {
                if((i & (1<<j)) != 0)
                    temp.add(nums[j]);
            }
            ar.add(temp);
        }
        return ar;
    }
}