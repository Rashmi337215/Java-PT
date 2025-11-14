package doublyll;
class Node{
    String data;
    Node next,prev;
    Node(String data)
    {
        this.data=data;
    }
}

public class CircularDoublyll {
    

    
    public static void main(String[] args) {
        Node head=new Node("A");
         Node sec=new Node("B");
          Node third=new Node("C");
          Node tail=new Node("D");
        
          head.next=sec;
          sec.next=third;
          third.next=tail;
          
          tail.prev=third;
          third.prev=sec;
          sec.prev=head;
          dis1(head);
          System.out.println();
          dis2(tail);
    }
          public static void dis1(Node head){
          Node n=head;
          do{
         
              System.out.print(n.data+"->");
              n=n.next;
          }while(n!=null);
     
    }
          
          public static void dis2(Node tail){
          Node n=tail;
          do{
              System.out.print(n.data+"->");
              n=n.prev;
          }while(n!=null);
          }
}
