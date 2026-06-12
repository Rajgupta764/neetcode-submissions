class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);

            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
