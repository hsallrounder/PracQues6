import java.util.Scanner;

public class Q1 {
    public int decToBinary(int n){
        if(n==0) return 0;
        return (decToBinary(n/2)*10)+(n%2);
    }
    public static void main(String[] args) {
        Q1 obj = new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to convert: ");
        System.out.println(obj.decToBinary(sc.nextInt()));
        sc.close();
    }
}
