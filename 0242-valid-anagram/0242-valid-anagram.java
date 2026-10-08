class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m) {
            return false;
        }
        HashMap<Character, Integer>map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch1 : s.toCharArray()){
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        for(char ch2 : t.toCharArray()){
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        return map2.equals(map1);

    }
}