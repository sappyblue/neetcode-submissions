class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        HashMap<Character,Integer> anaCount = new HashMap<Character,Integer>();
        for(char ch:s.toCharArray()){
            anaCount.put(ch, anaCount.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            anaCount.put(ch, anaCount.getOrDefault(ch,0)-1);
        }

        for(var pair:anaCount.entrySet()){
            if(pair.getValue()!=0){
                return false;
            }
        }

        return true;

    }
}
