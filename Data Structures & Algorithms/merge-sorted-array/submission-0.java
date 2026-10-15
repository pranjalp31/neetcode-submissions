class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] res=Arrays.copyOf(nums1,m);
        int idx=0,i=0,j=0;

        while(idx<(m+n)){
            if((j>=n || (i<m && res[i]<=nums2[j]))){
                nums1[idx++]=res[i++];
            }
            else{
                nums1[idx++]=nums2[j++];
            }
        }
        
    }
}