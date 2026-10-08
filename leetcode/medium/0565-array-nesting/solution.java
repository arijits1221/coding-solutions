class Solution {
    public int arrayNesting(int[] nums) {
        int maxm =0;
        for(int i = 0;i<nums.length;i++){
            Set<Integer> st = new HashSet<>();
            int n=nums[i];
            st.add(n);
            while(!st.contains(n)){
                st.add(n);
                n=nums[nums[n]];
            }
            maxm = Math.max(maxm,st.size());
        }
        return maxm;
    }
}