import Pre_Requisites.*;

import java.util.Scanner;

public class Q4 extends SinglyLinkedList {
    public void middleNode(){
        if(getSize()==0) return;
        NodeS temp=getHead();
        int n= getSize()%2==0 ? getSize()/2-1 : getSize()/2;
        for(int i=0;i<n;i++){
            temp=temp.getNext();
        }
        System.out.println(temp.getData());
    }
    public static void main(String[] args) {
        Q4 list;
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            list=new Q4();
            int data = sc.nextInt();
            while(data!=-1){
                list.add(data);
                data=sc.nextInt();
            }
            list.middleNode();
        }
        sc.close();
    }
}
