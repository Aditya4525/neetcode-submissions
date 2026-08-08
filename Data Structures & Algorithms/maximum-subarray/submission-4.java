class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currSum=0;
        for (int num:nums){
            if(currSum<0 && num>currSum){
                currSum=num;
            }else{
                currSum=currSum+num;
            }
            if(currSum>maxSum){
             maxSum=currSum;
             }
        }
        return maxSum;
    }
}
