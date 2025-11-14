package singlylinkedlist;

class Node{
        String data;
        Node next;
        
}
public class CSLL {

    
    public static void main(String[] args) {
         Node head =new Node();
        Node sec =new Node();
       Node third=new Node();
       Node fourth=new Node();
       Node tail=new Node();
       
        
         head.data="A";
        sec.data="B";
        third.data="C";
        fourth.data="D";
        
        
        head.next=sec;
        sec.next=third;
        third.next=fourth;
        fourth.next=tail;
        
        
        dis1(head);
                }
        public static void dis1(Node head){
            Node n=head;
       do{
           System.out.print(n.data+"->");
           n=n.next;
        }while(n!=null);}
        
        
       
    }
    

