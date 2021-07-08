class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        ArrayList<Integer> ar=new ArrayList();
		if(nums2.length==0)
        {
            for(int i=0;i<m+n;i++)
            System.out.print(nums1[i]);   
   
        }
        else if(nums1[0]==0 &&  nums1.length==0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
                System.out.println(nums1[i]);
            }   
   
        }
        else
		{
		for(int i=0;i<m;i++)
		{
			ar.add(nums1[i]);
		}
		//System.out.println(ar);
		for(int i=0;i<n;i++)
		{
			ar.add(nums2[i]);
			
		}
		//System.out.println(ar);
		Collections.sort(ar);
		//System.out.println(ar);
		//System.out.println(m-n);


		//System.out.println(ar);
		for(int i=0;i<ar.size();i++)
		{
			nums1[i]=ar.get(i);
			
		}
		for(int i=0;i<ar.size();i++)
		{
			System.out.print(nums1[i]);
			
		}
		
		}
    }
}