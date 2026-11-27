class Solution {
    static boolean canShip(int[]weights,int days,int cap){
        int day=1,curr=0;
        for(int w:weights){
            if((curr+w)>cap){
                day++;
                curr=w;
            }else{
                curr+=w;
            }
        }
        return day<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
      int low=0;
      int high=0;
      for(int w:weights){
        low=Math.max(low,w);
        high+=w;
      }  
      int ans=0;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(canShip(weights,days,mid)){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
      }
      return ans;
    }
}