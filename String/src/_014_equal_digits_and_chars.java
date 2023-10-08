public interface _014_equal_digits_and_chars {
    public static void main(String[] args) {
        String name="Dhruvv123459";
        char[] chars=name.toCharArray();

        int num=0;
        int ch=0;
        int i=0;

        while (i<chars.length){
            if(chars[i] >= '0' && chars[i] <= '9'){
                num++;
                i++;
            }else {
                ch++;
                i++;
            }
        }

        if(num==ch){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
