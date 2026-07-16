class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> v=new HashSet<>();
        int x=0,y=0;
        v.add(x+","+y);
        for(char c:path.toCharArray()){
            if(c=='N') y++;
            else if(c=='S') y--;
            else if(c=='E') x++;
            else if(c=='W') x--;
            String pos=x+","+y;
            if(v.contains(pos)) return true;
            v.add(pos);
        }
        return false;
    }
}