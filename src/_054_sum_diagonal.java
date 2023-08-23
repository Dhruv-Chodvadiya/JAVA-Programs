public class _054_sum_diagonal {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int row=mat.length;
        int sum=0;
        for(int r=0;r<row;r++){
            sum+=mat[r][r];
            if(r!=row-1-r){
                sum+=mat[r][row-1-r];
            }
        }
        System.out.println(sum);
    }
}
