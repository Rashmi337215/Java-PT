package singlylinkedlist;

class Node{
        float data;
        Node next;
        
}
public class SLL {

    
    public static void main(String[] args) {
         Node head =new Node();
        Node sec =new Node();
       
        Node tail =new Node();
        
         head.data=10.1f;
        sec.data=10.2f;
        tail.data=10.3f;
        
        head.next=sec;
        sec.next=tail;
        
        tail.next=null;
        dis(head);
                }
        public static void dis(Node head){
            Node n=head;
       while(n!=null){
           System.out.print(n.data+"->");
           n=n.next;
        }
        
        
        
       
    }}
    

