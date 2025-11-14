class Node{
    double data;
    Node next,prev;
    Node(double data)
    {
        this.data=data;
    }
}

public class DLL{
    

    
    public static void main(String[] args) {
        Node head=new Node( 10.1);
         Node sec=new Node( 10.2);
          Node tail=new Node( 10.3);
          head.next=sec;
          sec.next=tail;
          tail.next=null;
          
          tail.prev=sec;
          sec.prev=head;
          head.prev=null;
          dis1(head);
          System.out.println();
          dis2(tail);
    }
          public static void dis1(Node head){
          Node n=head;
          while(n!=null){
              System.out.print(n.data+"->");
              n=n.next;
          }
     
    }
          
          public static void dis2(Node tail){
          Node n=tail;
          while(n!=null){
              System.out.print(n.data+"->");
              n=n.prev;
          }

    
          }}
