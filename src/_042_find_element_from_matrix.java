public class _042_find_element_from_matrix {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int row=mat.length;
        int col=mat[0].length;
        int val=9;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(mat[r][c]==val){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
