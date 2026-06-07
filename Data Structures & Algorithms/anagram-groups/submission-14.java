class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map <String, List<String>> holder = new HashMap<>();

        for(String str : strs){

            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sorted = new String (temp);

            holder.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        List<List<String>> result = new ArrayList<>(holder.values());

        return result;

    }
}
