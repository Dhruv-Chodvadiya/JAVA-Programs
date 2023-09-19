public class _005_Update_char {
    public static void main(String[] args) {
        String name="dep";
        char[] n=name.toCharArray();
        for(int i=0;i<n.length;i++){
            if(n[i]=='e'){
                n[i]='i';
            }
        }
        String newString=new String(n);
        System.out.println(newString);
    }
}
