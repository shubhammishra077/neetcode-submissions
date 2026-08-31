class Solution {
    public boolean isValid(String s) {
      Stack<Character>sc=new Stack<>();
      for(char ch:s.toCharArray()){
        if(ch=='(') sc.push(')');
        else if(ch=='{') sc.push('}');
        else if(ch=='[') sc.push(']');
        else if(sc.isEmpty() || sc.pop()!=ch) return false;
      } 
      return sc.isEmpty();
    }
}
