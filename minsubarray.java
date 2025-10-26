class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length,s=0,l=0;
        int mini=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            s+=nums[r];
            while(s>=target){
                mini=Math.min(mini,r-l+1);
                s-=nums[l];
                l++;
            }
        }
        return(mini == Integer.MAX_VALUE ? 0 : mini);
    }
}
