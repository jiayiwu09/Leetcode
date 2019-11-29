import java.util.ArrayList;
import java.util.List;

public class Problem728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean isSelfDividing(int a){
       int temp = a;
       while (a > 0){
           int b = a % 10;
           if (b == 0 || temp % b != 0) {
               return false;
           }
           a /= 10;
       }
       return true;
    }
}
