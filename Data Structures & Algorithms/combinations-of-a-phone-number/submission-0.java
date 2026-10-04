class Solution {
    static void solve(String digits,String[] mapping,int index,List<String>ans,StringBuilder output){
       if(index>=digits.length()){
       ans.add(output.toString());
       return;
       }
       int value=digits.charAt(index)-'0';
       String mappedString=mapping[value];
       for(int i=0;i<mappedString.length();i++){
        output.append(mappedString.charAt(i));
        solve(digits,mapping,index+1,ans,output);
        output.deleteCharAt(output.length()-1);
       }
    }

    public List<String> letterCombinations(String digits) {
      String[] mapping={"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      StringBuilder output=new StringBuilder();
      int index=0;
      List<String>ans=new ArrayList<>();
      if(digits.length()==0){
        return ans;
      }
      solve(digits,mapping,index,ans,output);
      return ans;
    }
}
