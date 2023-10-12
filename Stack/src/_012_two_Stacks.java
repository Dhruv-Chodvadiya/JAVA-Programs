public class _012_two_Stacks {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int l=-1,r=arr.length;


        l=push1(10,arr,l,r);
        l=push1(20,arr,l,r);
        l=push1(30,arr,l,r);
        l=push1(40,arr,l,r);
        l=push1(50,arr,l,r);
        l=push1(60,arr,l,r);
        l=push1(70,arr,l,r);
        l=push1(80,arr,l,r);
        l=push1(90,arr,l,r);

        r=push2(100,arr,l,r);

        print1(l,arr);

        print2(r,arr);
    }
    public static int push1(int val,int[] arr,int l,int r){
        if(l==r-1){
            System.out.println("Full");
            return l;
        }
        l++;
        arr[l]=val;
        return l;
    }
    public static int push2(int val,int[] arr,int l,int r){
        if(r==l+1){
            System.out.println("Full");
            return r;
        }
        r--;
        arr[r]=val;
        return r;
    }
    public static int pop1(int l,int[] arr){
        if(l==-1){
            System.out.println("Empty");
            return l;
        }
        l--;
        return l;
    }
    public static int pop2(int r,int[] arr){
        if(r==arr.length){
            System.out.println("Empty");
            return r;
        }
        r++;
        return r;
    }
    public static void print1(int l,int[] arr){
        for(int i=l;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void print2(int r,int[] arr){
        for(int i=r;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
