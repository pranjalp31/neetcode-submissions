class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        for(int i:nums1) n1.add(i);
        for(int i:nums2) n2.add(i);
        List<Integer> res1=new ArrayList<>(n1);
        res1.removeAll(n2);
        List<Integer> res2=new ArrayList<>(n2);
        res2.removeAll(n1);
        return Arrays.asList(res1,res2);
    }
}