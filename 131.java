class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        method(res,temp,0,s);
        return res;
    }
    
    void method(List<List<String>> res,List<String> temp,int index,String str)
    {
        if(index == str.length())
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<str.length();i++)
        {
            if(palin(str,index,i))
            {
                temp.add(str.substring(index,i+1));
                method(res,temp,i+1,str);
                temp.remove(temp.size()-1);
            }
        }
    }
    boolean palin(String s,int start,int end)
    {
        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}