import Pre_Requisites.*;

import java.util.Scanner;

public class Q3 extends SinglyLinkedList{
    public boolean isSDupli(int n){
        NodeS temp=getHead();
        while(temp!=null){
            if(temp.getData()==n){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your linked list: ");
        int n=sc.nextInt();
        Q3 list = new Q3();
        System.out.print("Enter the values of the list:");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        sc.close();
        NodeS temp=list.getHead();
        Q3 newlist=new Q3();
        while(temp!=null){
            if(!newlist.isSDupli(temp.getData())) {
                newlist.add(temp.getData());
            }
            temp=temp.getNext();
        }
        System.out.println("Resultant list:");
        newlist.display();

    }
}
