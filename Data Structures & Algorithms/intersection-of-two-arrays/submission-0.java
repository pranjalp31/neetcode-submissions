class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        Set<Integer> set2=new HashSet<>();
        for(int i:nums2){
            set2.add(i);
        }
        List<Integer> res= new ArrayList<>();
        for(int i:set1){
            if(set2.contains(i)){
                res.add(i);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
        
    }
}