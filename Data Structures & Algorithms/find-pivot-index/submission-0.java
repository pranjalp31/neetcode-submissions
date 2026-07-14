class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i:nums){
            sum+=i;
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            int rsum=sum-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}