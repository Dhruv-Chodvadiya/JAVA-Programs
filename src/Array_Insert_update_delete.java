import java.util.Scanner;

public class Array_Insert_update_delete {
    public static int print(int[] arr,int len){
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }

    public static int insert(int[] arr,int p,int len,int size){
        if(p==len){
            System.out.println("Full");
            return 0;
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value : ");
        int val=sc.nextInt();
        arr[p]=val;
        p++;

        return p;
    }

    public static int update(int[] arr,int len){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Update no. : ");
        int val=sc.nextInt();
        --val;
       for(int i=0;i<len;i++){
           if(i==val){
               System.out.print("Enter Update value : ");
               int n=sc.nextInt();
               arr[i]=n;
               return arr[i];
           }
        }
        return 0;
    }

    public static int delete(int[] arr,int len){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Delete position : ");
        int val=sc.nextInt();
        --val;

        for(int i=0;i<len;i++){
            if(len-1==val){
                arr[len-1]=0;
                return arr[len-1];
            }
            if(i==val){
                arr[i]=arr[i+1];
                return arr[i];
            }

        }
        return 0;
    }
    public static int find(int[] arr,int len){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Find no. : ");
        int val=sc.nextInt();
        for(int i=0;i<len;i++){
            if(arr[i]==val){
                int ans=i+1;
                System.out.print("Array position : "+i);
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array size : ");
        int arrSize=sc.nextInt();
        int[] arr=new int[arrSize];
        int len=arr.length;
        int pointer=0;

        System.out.println("1 Insert \n2 Update \n3 Delete\n4 print\n5 Find\n6 Exit\n");
        System.out.print("Enter Case :");
        int number=sc.nextInt();

        while (number>0) {
            switch (number) {
                case 1:
                    pointer=insert(arr,pointer,len,arrSize);
                    break;
                case 2:
                    update(arr, len);
                    break;
                case 3:
                    delete(arr,len);
                    break;
                case 4:
                    print(arr, len);
                    break;
                case 5:
                    find(arr,len);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Number is not valid");
            }
            System.out.println("\n\n1 Insert \n2 Update \n3 Delete\n4 print\n5 Find\n6 Exit\n");
            System.out.print("Enter Case :");
            number=sc.nextInt();
        }
    }
}
