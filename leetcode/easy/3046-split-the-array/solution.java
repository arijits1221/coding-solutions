class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)>2){
                return false;
            }
        }
        return true;
    }
}