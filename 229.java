class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer>ar = new ArrayList();
        int el1 = -1;
        int el2 = -1;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<n;i++)
        {
            if(el1 == nums[i]) c1++;
            else if(el2 == nums[i]) c2++;
            else if(c1 == 0)
            {
                el1 = nums[i];
                c1 = 1;
            }
            else if(c2 == 0)
            {
                el2 = nums[i];
                c2 = 1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        int count1 = 0;
	    int count2 = 0;
	    for (int i = 0; i < n; i++) 
        {
		if (nums[i] == el1)
			count1++;
		else if (nums[i] == el2)
			count2++;
	    }
        if (count1 > n / 3)
		    ar.add(el1);
	    if (count2 > n / 3)
		    ar.add(el2);

        return ar;
        
    }
}