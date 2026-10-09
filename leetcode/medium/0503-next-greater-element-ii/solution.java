class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int index=0;
        int maxm=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(maxm<nums[i]){
                maxm=nums[i];
                index=i;
            }
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            
                int j=i;
                while(j<2*(nums.length)){
                    if(nums[j%nums.length]>nums[i]) break;
                    j++;
                }
                arr[i]=nums[j%nums.length];
            
        }
        return arr;
    }
}