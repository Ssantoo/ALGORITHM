import java.util.HashSet;

public class hash_level1 {
    public int hash_level1(int[] nums) {

        //중복을 막기 위해서
        HashSet<Integer> pokemonSet = new HashSet<>();

        //배열을 순회하며 추가
        for (int num: nums) {
            pokemonSet.add(num);
        }

        int maxSelect = nums.length / 2;

        return Math.min(pokemonSet.size(), maxSelect);

    }
}