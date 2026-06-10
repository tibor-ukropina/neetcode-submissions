// Definition for a pair
// class Pair {
//     int key;
//     String value;

//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }

private void swap(List<Pair> pairs, int i, int j){

    Pair temp = pairs.get(i);
    pairs.set(i, pairs.get(j));
    pairs.set(j, temp);
}

public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {

        if(pairs.isEmpty()){
            return new ArrayList<>();
        }

        List<List<Pair>> result = new ArrayList<>();

        result.add(new ArrayList(pairs));

        for(int i = 1; i < pairs.size(); i++){

            int j = i;

            while(j > 0 && pairs.get(j).key < pairs.get(j-1).key){
                swap(pairs, j, j-1);
                j--;
            }

            result.add(new ArrayList(pairs));

        }
    
        return result;

    }
}
