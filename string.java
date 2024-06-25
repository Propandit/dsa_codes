
import java.util.ArrayList; 
 
public class string { 
    public static void main(String[] args) { 
        String str = "1125"; 
        ArrayList<String> codes = getCode(str); 
        System.out.println(codes); 
    } 
 
    public static ArrayList<String> getCode(String str) { 
        if (str.length() == 0) { 
            ArrayList<String> baseResult = new ArrayList<>(); 
            baseResult.add(""); 
            return baseResult; 
        } 
 
        char ch1 = str.charAt(0); 
        String ros1 = str.substring(1); 
        ArrayList<String> recResult1 = getCode(ros1); 
        ArrayList<String> myResult = new ArrayList<>(); 
 
        for (String val : recResult1) { 
            myResult.add((char) (ch1 - '0' + 'a' - 1) + val); 
        } 
 
        if (str.length() >= 2) { 
            char ch2 = str.charAt(1); 
            int num = (ch1 - '0') * 10 + (ch2 - '0'); 
 
            if (num >= 10 && num <= 26) { 
                String ros2 = str.substring(2); 
                ArrayList<String> recResult2 = getCode(ros2); 
 
                for (String val : recResult2) { 
                    myResult.add((char) (num + 'a' - 1) + val); 
                } 
            } 
        } 
 
        return myResult; 
    } 
}