public class string2 {
public static void main(String[] args) {
for(char c = "a"; c <= 'z'; c++) {
    for(int i =1; i <=26; i++) {
Map<Integer, String> map = new HashMap<>();

map.put(i,c);

String str = map.toString();
System.out.println("Map: "+map);
}}

    
}}

