public class _055_matrix_pointer {
    public static void main(String[] args) {
        int[][] mat={
                {1,8,12},
                {2,9,15},
                {5,10,17}
        };
        int row=mat.length;
        int col=mat[0].length;
        int r=0;
        int c=col-1;
        int val=5;
        while(r<=row-1 && c>=0){
            if(val==mat[r][c]){
                System.out.println("Present");
                return;
            }else if(val<mat[r][c]){
                c--;
            }else {
                r++;
            }
        }
        System.out.println("Not Present");
    }
}
