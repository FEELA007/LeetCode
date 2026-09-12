class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean [] t=new boolean[nums.length+1];
        for(int n:nums){
            if(n>0 && n<=nums.length){
                t[n-1]=true;
            }
        
        }
        for(int i=0;i<nums.length;i++){
            if(!t[i]){
                return i+1;
            }
        }
        return nums.length+1;

    }
}