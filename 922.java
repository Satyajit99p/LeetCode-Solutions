class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[]odd=new int[n/2];
        int[] even=new int[n/2];
        int j=0;
        int k=0;
        for(int i = 0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                even[j]=nums[i];
                j++;
            }
            else
            {
                odd[k]=nums[i];
                k++;
            }
        }
        j=0;
        k=0;
        for(int i = 0;i<n;i++)
        {
            if(i%2==0)
            {
                nums[i]=even[j];
                j++;
            }
            else
            {
                nums[i]=odd[k];
                k++;
            }
        }
        return nums; 
    }
}