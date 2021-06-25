class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0)
            return 0;
        if(n==1 && nums[0]==val)
        {
            nums = new int[0];
            return 0;
        }
        if(n==1 && nums[0]!=val)
        {
            
            return 1;
        }
        if (nums[n-1]==val)
        {
            n=n-1; 
        }

        int d=0;
         for(int i=0;i<n;i++)
         {
             if(nums[i]==val)
             {   
                 d++;
             }
         }
        if (d==n)
        {
            nums=new int[0];
            return 0;
        }
        int b=n-1;
        int i=0;
        while(i<n)
        {
            if(nums[i]==nums[b] && nums[i] == val)
            {
                b--;
                continue;
            }
            if(nums[b]==val)
            {
                b--;
            }
            if(b<=i)
                { 
                    break;
                }
            if(nums[i]==val)
            {
                int temp=nums[i];
                nums[i]=nums[b];
                nums[b]=temp;
                
                b--;
            }
          i++;
                
        }
        return (n-d);
        
    }
    
}