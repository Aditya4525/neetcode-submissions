class Solution {
    public int trap(int[] height) {
        int[] prefixMax=new int[height.length];
        int[] suffixMax = new int[height.length];
        int max=0;
        for (int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
            }
            prefixMax[i]=max;
        }
        max=0;
        for (int i=height.length-1;i>=0;i--){
            if(height[i]>max){
                max=height[i];
            }
            suffixMax[i]=max;
        }
        int result=0;
        for(int i=0;i<height.length;i++){
            result=result+ (Math.min(prefixMax[i],suffixMax[i])-height[i]);
        }
        return result;
        
    }
}
