import Pre_Requisites.*;

import java.util.Scanner;
import java.util.Stack;

public class Q5 extends SinglyLinkedList {
    public void displayRec(NodeS temp){
        if(temp!=null){
            displayRec(temp.getNext());
            System.out.print(temp.getData()+" ");
        }
    }
    public void displayRev(){
        displayRec(getHead());
    }
    public void displayRevLoop(){
        Stack st=new Stack();
        NodeS temp=getHead();
        while(temp!=null){
            st.push(temp.getData());
            temp=temp.getNext();
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Q5 list;
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            list=new Q5();
            int data = sc.nextInt();
            while(data!=-1){
                list.add(data);
                data=sc.nextInt();
            }
            System.out.println("Using Recursion: ");
            list.displayRev();
            System.out.print("Using Loop: ");
            list.displayRevLoop();
        }
        sc.close();
    }
}
