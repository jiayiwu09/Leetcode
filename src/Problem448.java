
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Problem448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hSet = new HashSet<>();
        for(int i :nums){
            hSet.add(i);
        }
        for(int n = 1; n <= nums.length; n++){
            if(!hSet.contains(n)){
                list.add(n);
            }
        }
        return list;
    }
}
