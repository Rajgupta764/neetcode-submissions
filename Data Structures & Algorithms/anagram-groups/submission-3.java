class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        if(n==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
