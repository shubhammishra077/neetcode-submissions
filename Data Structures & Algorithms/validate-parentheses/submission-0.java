class Solution {
    public boolean isValid(String s) {
     Stack<Character> sc=new Stack();
      for(char ch:s.toCharArray()){
        if(ch=='[' || ch=='{' || ch=='('){
             sc.push(ch);
        }else{
           if(sc.isEmpty()){
            return false;
           }
         char top=sc.pop();
          if( ch==')' && top!='('){
            return false;
        }
        if( ch==']' && top!='['){
            return false;
        
        }
         if(ch=='}' && top!='{'){
            return false;
        }
         
        }        
       } 
       return sc.isEmpty();
    }
}
