class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> res=new HashSet<>();
        for(int i:nums){
            if(!res.contains(i)){
                res.add(i);
            }
            else{
                res.remove(i);
            }
        }
        return res.isEmpty();
    }
}