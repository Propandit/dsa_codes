class substringfin {
    public static void main(String[] args) {
        String str="abc";
        int l=0;
        String curr="";
        substring(str, l, curr);
    }
    private static void substring(String str, int l, String curr){
        if(l==str.length()){
            System.out.println(curr);
            return;
}
substring(str,l+1,curr+str.charAt(l));
substring(str,l+1,curr);
}}  