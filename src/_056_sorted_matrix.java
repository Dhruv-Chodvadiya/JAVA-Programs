public class _056_sorted_matrix {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row=mat.length;
        int col=mat[0].length;
        int val=9;
        int index=-1;
        int top=0,bottom=row-1;

        while(top<=bottom){
            int mid=(top+bottom)/2;
            if(val>=mat[mid][0] &&val<=mat[mid][col-1]){
                index=mid;
                break;
            } else if (val<mat[mid][0]) {
                bottom=mid-1;
            }else {
                top=mid+1;
            }
        }
        if(index==-1){
            System.out.println("Not Present");
            return;
        }

        int left=0,right=col-1;

        while (left<=right){
            int mid=(left+right)/2;
            if(val==mat[index][mid]){
                System.out.println("Present");
                return;
            } else if (val<mat[index][mid]) {
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        System.out.println("Not Present");
    }
}
