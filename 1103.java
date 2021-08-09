class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int ar[]=new int[num_people];
        int x=0;
        int s=0;
        int i=0;
        for(int j=0;j<num_people;j++)
            ar[j]=0;
            while(true)
            {
                
                
                
                if(x+1<=(candies-s))
                {
                    ar[i]+=x+1;     
                    x++;
                    i++;
                }
                else
                {
                    ar[i]+=candies-s;
                    break;
                }
                s=s+x;
               if(i==num_people)
                    i=0;     
                
        }
    
        return ar;
}
}