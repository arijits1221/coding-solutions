class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int index=0;
        int maxm=0;
        for(int i=0;i<nums.length;i++){
            if(maxm<nums[i]){
                maxm=nums[i];
                index=i;
            }
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==index||nums[i]==maxm){
                arr[i]=-1;
            }
            else if(i>index){
                arr[i]=maxm;
            }
            else{
                int j=i;
                while(j<nums.length){
                    if(nums[j]>nums[i]) break;
                    j++;
                }
                arr[i]=nums[j];
            }
        }
        return arr;
    }
}