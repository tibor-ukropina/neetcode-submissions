class Solution {
    public boolean isAnagram(String s, String t) {

        Map <Character, Integer> count1 = new HashMap<Character, Integer>();
        Map <Character, Integer> count2 = new HashMap<Character, Integer>();

        if(s.length() != t.length() || s == null || t == null){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            if(count1.containsKey(s.charAt(i))){
                int temp = count1.get(s.charAt(i));
                temp++;
                count1.put(s.charAt(i), temp);
            }
            else{
                count1.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++){
            if(count2.containsKey(t.charAt(i))){
                int temp = count2.get(t.charAt(i));
                temp++;
                count2.put(t.charAt(i), temp);
            }
            else{
                count2.put(t.charAt(i), 1);
            }
        }

        return count1.equals(count2);

    }
}
