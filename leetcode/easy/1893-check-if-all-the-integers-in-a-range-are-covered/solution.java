class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
       Set<Integer> st = new HashSet<>();
       for(int i = left;i<=right;i++){
        st.add(i);
       }
       for(int i =0;i<ranges.length;i++){
        if(ranges[i][0]<=left && ranges[i][1]>=right){
            return true;
        }
       }  
       boolean is =false;
       for(int i =0;i<ranges.length;i++){
        for(int j=ranges[i][0];j<=ranges[i][1];j++){
            if(j>=left && j<=right){
                st.remove(j);
            }
        }
       } 
       return st.size()==0;
    }
}