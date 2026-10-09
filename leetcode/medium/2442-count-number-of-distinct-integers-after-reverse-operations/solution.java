class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n: nums){
            st.add(n);
        }
        for(int i = 0;i<nums.length;i++){
            int n=nums[i];
            int rev=0;
            while(n>0){
                rev = rev*10+n%10;
                n=n/10;
            }
            st.add(rev);
        }
        return st.size();
    }
}