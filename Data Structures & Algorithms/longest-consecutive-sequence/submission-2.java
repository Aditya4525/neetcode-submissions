class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            if(nums.length==0){
                return 0;
            }
            return 1;
        }
        Arrays.sort(nums);
        int max=1;
        int currMax=1;
        int currNum=nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i]==currNum){
                currNum=nums[i];
                continue;
            }
            if(nums[i]-currNum==1){
                currMax=currMax+1;
            }else{
                currMax=1;
            }
            if(currMax>max){
                max=currMax;
            }
            currNum=nums[i];
        }
        return max;
    }
}
