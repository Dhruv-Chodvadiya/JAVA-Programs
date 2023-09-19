public class _006_sort {
    public static void main(String[] args) {
        String name = " Drhvu";
        char[] n=name.toCharArray();

        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i] > n[j]){
                    char temp=n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        String sortName=new String(n);
        System.out.println(sortName);
    }
}
