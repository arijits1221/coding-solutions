class Solution {
    public int arrayNesting(int[] nums) {
        int maxm =0;
            Set<Integer> st = new HashSet<>();
            int n=nums[0];
            while(!st.contains(n)){
                st.add(n);
                n=nums[n];
            }
            maxm = Math.max(maxm,st.size());
            if(nums.length<2) return maxm;
            n=nums[1];
            Set<Integer> st1 = new HashSet<>();
            while(!st1.contains(n)){
                st1.add(n);
                n=nums[n];
            }

            maxm = Math.max(st1.size(),st.size());
        
        return maxm;
    }
}