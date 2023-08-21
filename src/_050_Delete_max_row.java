public class _050_Delete_max_row {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,55,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        for(int r=0;r<row;r++){
            int maxIndex=0;
            for(int c=0;c<col;c++){
                if(mat[r][c]>mat[r][maxIndex]){
                    maxIndex=c;
                }
            }
            for(int i=maxIndex;i<col-1;i++){
                mat[r][i]=mat[r][i+1];
            }
        }
        col--;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
}
