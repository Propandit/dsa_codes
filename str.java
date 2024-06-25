
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class str {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    
        String num = sc.next();
        String[] strArray = {"vidhi", "divyam", "Yidhi", "sparsh", "akku",};

        List<String> matched = new ArrayList<>();

        String[] keypad = {"+@$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (String string : strArray) {
            for (char digit : num.toCharArray()) {
                String characters = keypad[Character.getNumericValue(digit)];
                for (char c : characters.toCharArray()) {
                    if (string.contains(String.valueOf(c))) {
                        matched.add(string);
                        break;
                    }
                }
            }
        }

        for (String matchedString : matched) {
            System.out.println(matchedString);
        }
    }
}