import java.lang.*;
class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean c=false;
        //double x=Math.log(n)/Math.log(2);
        //System.out.println(x);
        for(int i=0;i<32;i++)
        {
            if(Math.pow(2,i)==n)
                c=true;
            else
                continue;
        }
        System.out.println(c);
        return c;
            
    }
}