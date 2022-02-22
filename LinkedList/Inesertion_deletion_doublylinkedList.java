public class Inesertion_deletion_doublylinkedList {
    private listnode head;
    private listnode tail;
    public int length;
    public class listnode{
        int data;
        listnode previous;
        listnode next;

        public listnode(int data){
            this.data = data;
        }
    }
    public Inesertion_deletion_doublylinkedList(){
        this.head = null;
        this.tail = null;
        this.length=0;
    }
    public boolean isempty(){
        if(length==0){
            return true;
        }else{
            return false;
        }
    }
    public void display(){
        listnode current = head;
        while(current!=null){
            System.out.print(current.data + "-->");
            current=current.next;
        }System.out.println("null");
        System.out.println();
    }
    public void insertlast(int data){
        listnode newnode = new listnode(data);
        if(isempty()){
            head = newnode;
        }else{
            tail.next = newnode;
        }
        newnode.previous=tail;
        tail = newnode;
        length++;
    }
    public void insertfirst(int data){
        listnode newnode = new listnode(data);
        if(isempty()){
            tail = newnode;
        }else{
            head.previous = newnode;
        }
        newnode.next=head;
        head = newnode;
        length++;

    }
    public void deletelast(){
        if(isempty()){
            System.out.println("no node to delete");
        }else{
        System.out.println("Deleted data is:"+tail.data);
        tail = tail.previous;
        tail.next=null;
        length--;
        }
    }
    public void deletefirst(){
        if(isempty()){
            System.out.println("no node to delete");
        }else{
            System.out.println("Deleted data is:"+head.data);
            head = head.next;
            head.previous=null;
            length--;
        }
    }
    public static void main(String[] args){
        Inesertion_deletion_doublylinkedList dll =new Inesertion_deletion_doublylinkedList();
        dll.insertlast(10);
        dll.insertlast(20);
        dll.insertlast(30);
        dll.insertlast(40);
        dll.insertlast(50);
        dll.insertlast(60);
        dll.insertlast(70);

        dll.display();
        dll.deletelast();
        dll.display();
        dll.insertfirst(5);
        dll.display();
        dll.deletefirst();
        dll.display();

    }
}
