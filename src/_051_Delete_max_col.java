public class _051_Delete_max_col {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,55,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        for(int r=0;r<col;r++){
            int maxIndex=0;
            for(int c=0;c<row;c++){
                if(mat[c][r]>mat[maxIndex][r]){
                    maxIndex=c;
                }
            }
            for(int i=maxIndex;i<row-1;i++){
                mat[i][r]=mat[i+1][r];
            }
        }
        row--;

        for(int r=0;r<col;r++){
            for(int c=0;c<row;c++){
                System.out.print(mat[c][r]+" ");
            }
            System.out.println();
        }
    }
}
