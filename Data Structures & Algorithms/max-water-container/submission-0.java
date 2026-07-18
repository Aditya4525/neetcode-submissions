class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int max=0;
        while(i<j){
            int maxWater;
            if(heights[i]>heights[j]){
                maxWater=heights[j]*(j-i);
                j--;

            }else{
                maxWater=heights[i]*(j-i);
                i++;
            }
            max=Math.max(max,maxWater);
        }
        return max;
    }
}
