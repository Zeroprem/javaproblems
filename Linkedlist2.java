public class Linkedlist {
public static class Node{
    int data;
    Node next;
    public  Node (int data){
        this.data=data;
        this.next=null;
    }}
    public static Node head;
    public static Node tail;
public void addFirst(int data){
    Node newNode= new Node(data); //new node
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;  //linling
    head=newNode;

}
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
      tail= newNode;
    }
    public void print(){
   Node temp=head;
   if(head==null){
       System.out.println("List is null");
   }
    while (temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
        System.out.println();
    }
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public static void main(String[] args) {
    Linkedlist ll=new Linkedlist();
        ll.print();
        ll.addFirst(2);
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.add(2,4);
        ll.print();


    }
}
