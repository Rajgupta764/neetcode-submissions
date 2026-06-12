class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int n=heights.length;
        int right=n-1;
        int area=0;
        while(left<right){
            int length=right-left;
            int breadth=Math.min(heights[left],heights[right]);
            area=Math.max(area,length*breadth);

            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}
