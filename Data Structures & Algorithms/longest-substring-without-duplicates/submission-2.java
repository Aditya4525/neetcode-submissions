class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> indexMap=new HashMap<>();
        int res=0;
        int l=0;
        for (int r=0;r<s.length();r++){
            if(indexMap.containsKey(s.charAt(r))){
                l=Math.max(l,indexMap.get(s.charAt(r))+1);
            }
            indexMap.put(s.charAt(r),r);
            res=Math.max(res,r-l+1);
        }
        return res;
  
    }
}
