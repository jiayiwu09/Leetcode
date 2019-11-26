public class Problem711 {
    public static void main(String[] args){
    int result = numJewelsInStones("aA", "aAAbbbb");
    System.out.println(result);
    }

    public static int numJewelsInStones(String J, String S) {
        int n = 0;
        for(int i = 0; i< J.length(); i++){
            char a = J.charAt(i);
            for (int j = 0; j< S.length();j++){
                char k = S.charAt(j);
                if (a == k) {
                    n++;
                }
            }
        }

        return n;
    }
}
