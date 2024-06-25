public class permutation {
    public static void main(String[] args) {
        String s ="aba";
        per(s,"");
    }
        private static void per(String s , String ans) {
        
        if (ans.length()==3) {
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<s.length();i++)
            per(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));        
        }
    
    }    
    
    
    
