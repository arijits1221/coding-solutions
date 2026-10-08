class Solution {
    public boolean judgeCircle(String moves) {
        int r=0 , l=0 , u=0,  d=0;
        for(int i =0;i<moves.length();i++){
            if(moves.charAt(i)=='R') r+=1;
            else if(moves.charAt(i)=='L') l+=1;
            else if(moves.charAt(i)=='U') u+=1;
            else d+=1;
        }
        return ((r==l) && (u==d));
    }
}