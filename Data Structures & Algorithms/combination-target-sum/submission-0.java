class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int index=0;
        List<Integer> curr= new ArrayList();
        findCombinations(nums,target,result,index,curr);
        return result;
        
    }
    public void findCombinations(int[] nums,int target,List<List<Integer>> result, int index,List<Integer> curr){
        if(target==0){
            result.add(new ArrayList(curr));
            return;
        }

        if(index>=nums.length||target<0){
            return;
        }
        curr.add(nums[index]);
        findCombinations(nums,target-nums[index],result,index,curr);
        curr.remove(curr.size()-1);
        findCombinations(nums,target,result,index+1,curr);
    }
}
