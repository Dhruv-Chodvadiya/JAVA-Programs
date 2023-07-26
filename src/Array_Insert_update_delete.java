import java.util.Scanner;

public class Array_Insert_update_delete {
    public static void print(int[] arr,int len){
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int insert(int[] arr,int p,int len){
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

    public static void update(int[] arr,int p){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Update no. : ");
        int val=sc.nextInt();
        --val;
       for(int i=0;i<p;i++){
           if(i==val){
               System.out.print("Enter Update value : ");
               int n=sc.nextInt();
               arr[i]=n;
           }
        }
    }

    public static int delete(int[] arr,int p){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Delete value : ");
        int val=sc.nextInt();

        for(int i=0;i<p;i++){
            if(arr[i]==val){
                for (int j=i;j<(p-1);j++){
                    arr[j]=arr[j+1];
                }p--;
            }
        }
        return p;
    }
    public static void find(int[] arr,int p){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Find no. : ");
        int val=sc.nextInt();
        for(int i=0;i<p;i++){
            if(arr[i]==val){
                int ans=i+1;
                System.out.print("Array position : "+ans);
                return;
            }
        }
        System.out.println("Not find");
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
                    pointer=insert(arr,pointer,len);
                    break;
                case 2:
                    update(arr, len);
                    break;
                case 3:
                    pointer=delete(arr,pointer);
                    break;
                case 4:
                    print(arr, pointer);
                    break;
                case 5:
                    find(arr,pointer);
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
