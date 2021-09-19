class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int start=-1,end=0;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                start = i-1;
                break;
            }
        }
        if(start == -1)
        {
            for(int i=1;i<n;i++)
            {
                int key = nums[i];
                int j=i-1;
                while(j>=0 && nums[j]>key)
                {
                    nums[j+1]=nums[j];
                    j--;
                }
                nums[j+1] = key;
            }
        }
        else
        {
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[start])
            {
                end = i;
                break;
            }
        }
        System.out.println(start+" "+end);

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        int p=start+1;
        int q = n-1;
        while(p<q)
        {
            int t=nums[p];
            nums[p]=nums[q];
            nums[q] = t;
            p++;
            q--;
        }
        }
    }
}