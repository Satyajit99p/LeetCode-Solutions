import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ar=new ArrayList();
		//System.out.println("enter elements");
		for(int i=0;i<digits.length;i++)
		{
			
			ar.add(digits[i]);
		}
        int c=0;
		for(int i=0;i<digits.length;i++)
		{
			if(digits[i]==9)
                c++;
		}
        if(c==digits.length)
            ar.add(0, 0);
		for(int i=ar.size()-1;i>=0;i--)
		{
			
			if(ar.get(i)==9)
			{
				ar.set(i, 0);	
			}
			else
			{
				ar.set(i, ar.get(i)+1);
				break;
			}
		}
        int[] nums=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
		{
			nums[i]=ar.get(i);
		}
        return nums;
    }
}