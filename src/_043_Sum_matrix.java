public class _043_Sum_matrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        int sum=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                sum+=mat[r][c];
            }
        }
        System.out.println(sum);
    }
}
