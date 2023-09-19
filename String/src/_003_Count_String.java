public class _003_Count_String {
    public static void main(String[] args) {
        String n="Good Morning";
        int count=0;

        //Split count words
        System.out.println(n.split(" ").length);

        //without split count words
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);

        //split count character
        String[] string = n.split(" ");
        for(int i=0;i< string.length;i++){
            count+=string[i].length();
        }
        System.out.println(count);
        count=0;

        //without split count character
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==' '){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
