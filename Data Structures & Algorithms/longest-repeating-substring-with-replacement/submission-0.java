class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;int maxFreq=0;int maxLength=0;
        for(int right=0;right<s.length();right++){
            //Update the freq in arr
            freq[s.charAt(right)-'A']++; 
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']); //store maxFrew

            int windowLen=right-left+1; 
            if(windowLen-maxFreq>k){
                freq[s.charAt(left)-'A']--;   //reduce the freq if greater than K
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);  //update the maxLength
        }
        return maxLength;
    }
}
