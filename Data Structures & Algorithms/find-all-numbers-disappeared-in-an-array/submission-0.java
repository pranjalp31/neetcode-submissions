class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        for(int i=1;i<=n;i++) st.add(i);

        for(int i:nums){
            st.remove(i);
        }
        return new ArrayList<>(st);
    }
}