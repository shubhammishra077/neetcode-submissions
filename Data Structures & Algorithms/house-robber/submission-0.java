class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
     if(n==1){
        return nums[0];
     }  
     int[] dp=new int[n];

     dp[n-1]=nums[n-1];
     dp[n-2]=Math.max(nums[n-2],nums[n-1]);

     for(int i=n-3;i>=0;i--){
        int pick=nums[i]+dp[i+2];             
        int notPick=dp[i+1];

         dp[i]=Math.max(pick,notPick);
     }
     return dp[0];

    }
}
