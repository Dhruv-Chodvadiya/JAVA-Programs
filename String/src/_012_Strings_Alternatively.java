public class _012_Strings_Alternatively {
    public static void main(String[] args) {
        String name1="Drv";
        String name2="hu";
        String name3="";

        char[] n1=name1.toCharArray();
        char[] n2=name2.toCharArray();

        int i=0;
        int j=0;

        while (i<n1.length && j<n2.length){
            name3+=n1[i];
            name3+=n2[i];
            i++;
            j++;
        }

        while (i<n1.length){
            name3 += n1[i];
            i++;
        }

        while (j<n2.length){
            name3+=n2[j];
            j++;
        }

        System.out.println(name3);
    }
}
