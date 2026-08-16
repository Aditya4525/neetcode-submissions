class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProd=new int[nums.length];
        int[] rightProd=new int[nums.length];

        int currLeftProd=1;
        leftProd[0]=1;
        for (int i=1;i<nums.length;i++){
            currLeftProd=currLeftProd*nums[i-1];
            leftProd[i]=currLeftProd;
        }
        int currRightProd=1;
        rightProd[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            currRightProd=currRightProd*nums[i+1];
            rightProd[i]=currRightProd;
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=leftProd[i]*rightProd[i];
        }
        return result;

    }
}  
