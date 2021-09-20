class Solution {
    public double myPow(double x, int n) {
        double f=1;
        long nn = n;
        if( n<0)
            nn=-1*nn;
        
        while(nn>0)
        {
            if(nn % 2 == 0)
            {
                x = x*x;
                nn=nn/2;
            }
            else
            {
                f=f*x;
                nn--;
            }
        }
        if(n<0)
            f=1.0/f;
        
        return f;
    }
}