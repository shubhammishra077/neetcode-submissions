class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int reqnum=target-nums[i];
        if(map.containsKey(reqnum)){
          int[] arr={map.get(reqnum),i};
          return arr;
        }
        map.put(nums[i],i);
      }  
      return null;
    }
}
