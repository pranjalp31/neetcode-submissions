class Solution {
    public int heightChecker(int[] heights) {
        int[] h1=Arrays.copyOf(heights,heights.length);
        Arrays.sort(h1);

        int count=0;
        for(int i=0;i<h1.length;i++){
            if(heights[i]!=h1[i]){
                count++;
            }
        }
        return count;
        
    }
}