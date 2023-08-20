public class _047_print_matrix_zig_zag {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(r%2==0) {
                    System.out.print(mat[r][c] + " ");
                }
                else{
                    System.out.print(mat[r][col-c-1]+" ");
                }
            }
            System.out.println();
        }
    }
}
