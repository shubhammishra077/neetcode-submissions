class Solution {
    public int findMin(int[] nums) {
      int s=0;
      int l=nums.length-1;
      while(s<l) {
        int mid=s+(l-s)/2;
        if(nums[mid]>nums[l]){
            s=mid+1;
        }else{
            l=mid; //because mid itself could be minimum
        }
      }
      return nums[s];
    }
}
