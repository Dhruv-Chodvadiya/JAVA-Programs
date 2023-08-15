import java.util.Arrays;

public class _040_Insert_update_delete_sort {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int p=0;

        p=insert(arr,p,10);
        p=insert(arr,p,20);
        p=insert(arr,p,15);
        p=insert(arr,p,5);

//        p=delete(arr,p,15);

//        update(arr,p,5,55);
//
        find(arr,p,55);

        for(int i=0;i<p;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int insert(int[] arr,int p,int val){
        if(p==arr.length){
            System.out.println("Full");
            return p;
        }
        if(p==0){
            arr[p]=val;
            p++;
            return p;
        }else {
            if(val>arr[p-1]){
                arr[p]=val;
                p++;
                return p;
            }else{
                for(int i=p-1;i>=0;i--){
                    if(val<arr[i]){
                        arr[i+1]=arr[i];
                        arr[i]=val;
                    }
                }
                p++;
            }
        }
        return p;
    }

    public static int delete(int[] arr,int p,int val){
        for(int i=0;i<p;i++){
            if(val==arr[i]){
                for(int j=i;j<p-1;j++){
                    arr[j]=arr[j+1];
                }
                p--;
            }
        }
        return p;
    }
    public static void find(int[] arr,int p,int val){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(val==arr[mid]){
                System.out.println("Present");
                return;
            } else if (val>arr[mid]) {
                left=mid+1;
            }else if(val<arr[mid]){
                right=mid-1;
            }
        }
        System.out.println("Not present");
    }
    public static void update(int[] arr,int p,int old,int val){
        p=delete(arr,p,old);
        p=insert(arr,p,val);
    }
}
