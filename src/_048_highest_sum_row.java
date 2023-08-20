public class _048_highest_sum_row {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        int max=0;
        for(int r=0;r<row;r++){
            int sum=0;
            for(int c=0;c<col;c++){
                sum+=mat[r][c];
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
