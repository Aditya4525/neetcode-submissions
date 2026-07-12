class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] chars=str.toCharArray();
            int[] count=new int[26];
            for(char character:chars){
                count[character - 'a']++;
            }
            String key = Arrays.toString(count);
            if(map.get(key)==null){
                List<String> anagrams=new ArrayList<>();
                anagrams.add(str);
                map.put(key,anagrams);
            }else{
                List<String> anagrams=map.get(key);
                anagrams.add(str);
                map.put(key,anagrams);
            }
        }
         return new ArrayList<>(map.values());
    }
}
