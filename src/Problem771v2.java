import java.util.HashMap;

public class Problem771v2 {
    public static void main(String[] args){
        int result = numJewelsInStones("aA", "aAAbbbb");
        System.out.println(result);
    }

    public static int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        for (char n : J.toCharArray()) {
            hMap.put(n,0);
        }
        for (char m : S.toCharArray()) {
            if(hMap.containsKey(m)){
                int a = hMap.get(m);
                hMap.put(m,a+1);
            }
        }
        int sum = 0;
        for (char key : hMap.keySet()){
            int b = hMap.get(key);
            sum += b;
        }
        return sum;

    }

}
