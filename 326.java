class Solution {
    public boolean isPowerOfThree(int n) {
        System.out.println(n);
        if(n == 1)
            return true;
        if(n<1)
            return false;
        if(n%3==0)
            return isPowerOfThree(n/3);
        else
            return false;
    }
}