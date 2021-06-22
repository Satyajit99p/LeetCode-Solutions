import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> r=new HashMap<>();
		r.put('I', 1);
		r.put('V', 5);
		r.put('X', 10);
		r.put('L', 50);
		r.put('C', 100);
		r.put('D', 500);
		r.put('M', 1000);
		int sum=0;
		sum=sum+r.get(s.charAt(s.length()-1));
		for(int i=s.length()-1;i>0;i--)
		{
			int val1=r.get(s.charAt(i));
			//System.out.println(val1);
			int val2=r.get(s.charAt(i-1));
			if(val2>=val1)
				sum=sum+val2;
			else
				sum=sum-val2;
				
		}
		return sum;
    }
}