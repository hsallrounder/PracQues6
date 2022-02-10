import Pre_Requisites.*;

import java.util.Scanner;
import java.util.Stack;

public class Q6 {
    public boolean isPalindrome(NodeS head){
        Stack<Integer> st = new Stack();
        NodeS temp=head;
        while (temp!=null){
            st.push(temp.getData());
            temp=temp.getNext();
        }
        temp=head;
        while(temp!=null){
            if(st.pop()!=temp.getData()){
                return false;
            }
            temp=temp.getNext();
        }
        return true;
    }
    public static void main(String[] args) {
        SinglyLinkedList list;
        Scanner sc = new Scanner(System.in);
        Q6 obj = new Q6();
        int t=sc.nextInt();
        while(t-->0){
            list=new SinglyLinkedList();
            int data=sc.nextInt();
            while(data!=-1){
                list.add(data);
                data= sc.nextInt();
            }
            System.out.println(obj.isPalindrome(list.getHead()));
        }
        sc.close();
    }
}
