import java.util.ArrayList;

public class Problem1108 {
    public static void main(String[] args){
        String b = defangIPaddr("1.1,1.1");
        String c = defangIPaddr("255.100.50.0");
        System.out.println(b);
        System.out.println(c);
    }
    public static String defangIPaddr(String address) {
//        if (address.length() == 0)
//        {
//            return null;
//        }
//        String[] str = address.split("[.]");
//        String ip = "";
//        for (String a :str){
//            ip += a+"[.]";
//        }
//        String output;
//        output = ip.substring(0,ip.length()-3);
//        return output;
        if (address.length() == 0)
        {
            return null;
        }
        String[] str = address.split("[.]");
        StringBuilder ip = new StringBuilder();
        for (String a :str){
            ip.append(a + "[.]");
        }
        String output;
        output = ip.substring(0,ip.length()-3);
        return output;


    }
}
