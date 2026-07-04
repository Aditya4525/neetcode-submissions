class Solution {
    public boolean isAnagram(String s, String t) {
        char[] one=s.toCharArray();
        char[] two=t.toCharArray();
        if(!(one.length==two.length)){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:one){
            if(map.get(a)!=null){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        for(char a:two){
            if(map.get(a)!=null){
                map.put(a,map.get(a)-1);
            }
            else{
                map.put(a,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
