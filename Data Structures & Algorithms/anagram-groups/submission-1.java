class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //creating a HashMap
       Map<String,List<String>> map=new HashMap<>();
       //Traverse in strs with for each loop
       for(String str:strs){
        //convert each word into char Array
        char[] ch=str.toCharArray();
        Arrays.sort(ch);    //sort the word

        String key=new String(ch);  //create a key for the word
        map.computeIfAbsent(key,k->new ArrayList<>()).add(str); //checks if the key already   present then return the key and add the new word to the list.
        //Else create a new key and add the word to it
       }
       return new ArrayList<>(map.values()); // return all the values as new ArrayList.
    }
}
