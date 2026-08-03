class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Pair[] arr= new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(heights[i], names[i]);
        }
        Arrays.sort(arr, (a,b)-> Integer.compare(b.height, a.height));
        String[] res= new String[n];
        for(int i=0;i<n;i++){
            res[i]= arr[i].name;
        }
        return res;
    }
    static class Pair{
        int height;
        String name;
        Pair(int height, String name){
            this.height=height;
            this.name=name;
        }
    }
}