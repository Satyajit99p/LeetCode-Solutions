import java.util.*;
class Solution {
    public int reverse(int x) {
      String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
try {
   if(x<0)
       return (Integer.parseInt(reversed)*-1);
    else
        return (Integer.parseInt(reversed));
        
} catch (NumberFormatException e) {
    return 0;
}
		
        
    }
}