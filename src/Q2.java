import java.util.Scanner;

public class Q2 {
    public boolean linearSearch(int[] arr,int start,int end,int n){
        if(end<start) return false;
        if(arr[start]==n) return true;
        if(arr[end]==n) return true;
        return linearSearch(arr,start+1,end-1,n);
    }
    public static void main(String[] args) {
        Q2 obj = new Q2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<s;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search: ");
        System.out.println(obj.linearSearch(arr,0,arr.length-1,sc.nextInt()));
        sc.close();
    }
}
