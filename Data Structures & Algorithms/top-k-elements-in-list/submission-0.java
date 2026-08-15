class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<Integer>[] frequencyArr =new List[nums.length+1];
        for (int i = 0; i < frequencyArr.length; i++) {
            frequencyArr[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            frequencyArr[entry.getValue()].add(entry.getKey());
        }
        int[] result=new int[k];
        int index=0;
        for(int i=nums.length;i>0 && index<k;i-- ){
            for(int element:frequencyArr[i]){
                result[index++]=element;
                if(index==k){
                    return result;
                }
            }
        }
        return result;
                              
    }
}
